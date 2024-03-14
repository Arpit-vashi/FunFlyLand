package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.CashierDto;
import org.pgs.backedfunflyland.mapper.CashierMapper;
import org.pgs.backedfunflyland.model.CashierModel;
import org.pgs.backedfunflyland.repository.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CashierService {

    private final CashierRepository cashierRepository;

    @Autowired
    public CashierService(CashierRepository cashierRepository) {
        this.cashierRepository = cashierRepository;
    }

    public List<CashierDto> getAllCashiers() {
        return cashierRepository.findAll().stream()
                .map(CashierMapper.INSTANCE::cashierToCashierDto)
                .collect(Collectors.toList());
    }

    public CashierDto getCashierById(Long id) {
        CashierModel cashierModel = cashierRepository.findById(id).orElse(null);
        return CashierMapper.INSTANCE.cashierToCashierDto(cashierModel);
    }

    public CashierDto createCashier(CashierDto cashierDto) {
        CashierModel cashierModel = CashierMapper.INSTANCE.cashierDtoToCashier(cashierDto);
        cashierModel = cashierRepository.save(cashierModel);
        return CashierMapper.INSTANCE.cashierToCashierDto(cashierModel);
    }

    public CashierDto updateCashier(Long id, CashierDto cashierDto) {
        CashierModel existingCashier = cashierRepository.findById(id).orElse(null);
        if (existingCashier != null) {
            // Update the fields from DTO
            existingCashier.setUsername(cashierDto.getUsername());
            existingCashier.setPassword(cashierDto.getPassword());
            existingCashier.setSalary(cashierDto.getSalary());
            existingCashier.setEmail(cashierDto.getEmail());
            existingCashier.setMobileNumber(cashierDto.getMobileNumber());
            existingCashier.setJoiningDate(cashierDto.getJoiningDate());

            // Save the updated cashier
            existingCashier = cashierRepository.save(existingCashier);

            // Map and return the updated DTO
            return CashierMapper.INSTANCE.cashierToCashierDto(existingCashier);
        } else {
            return null; // Handle not found case
        }
    }

    public void deleteCashier(Long id) {
        cashierRepository.deleteById(id);
    }
}
