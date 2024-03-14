package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.VoucherDto;
import org.pgs.backedfunflyland.mapper.VoucherMapper;
import org.pgs.backedfunflyland.model.VoucherModel;
import org.pgs.backedfunflyland.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoucherService {

    private final VoucherRepository voucherRepository;

    @Autowired
    public VoucherService(VoucherRepository voucherRepository) {
        this.voucherRepository = voucherRepository;
    }

    public List<VoucherDto> getAllVouchers() {
        return voucherRepository.findAll().stream()
                .map(VoucherMapper.INSTANCE::voucherToVoucherDto)
                .collect(Collectors.toList());
    }

    public VoucherDto getVoucherById(Long id) {
        VoucherModel voucherModel = voucherRepository.findById(id).orElse(null);
        return VoucherMapper.INSTANCE.voucherToVoucherDto(voucherModel);
    }

    public VoucherDto createVoucher(VoucherDto voucherDto) {
        VoucherModel voucherModel = VoucherMapper.INSTANCE.voucherDtoToVoucher(voucherDto);
        voucherModel = voucherRepository.save(voucherModel);
        return VoucherMapper.INSTANCE.voucherToVoucherDto(voucherModel);
    }

    public VoucherDto updateVoucher(Long id, VoucherDto voucherDto) {
        VoucherModel existingVoucherModel = voucherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Voucher not found with id: " + id));

        VoucherModel updatedVoucherModel = VoucherMapper.INSTANCE.voucherDtoToVoucher(voucherDto);
        updatedVoucherModel.setId(existingVoucherModel.getId()); // Set ID from path variable

        // Update additional fields
        existingVoucherModel.setCode(updatedVoucherModel.getCode());
        existingVoucherModel.setDiscount(updatedVoucherModel.getDiscount());
        existingVoucherModel.setValidForNumberOfCustomers(updatedVoucherModel.getValidForNumberOfCustomers());
        existingVoucherModel.setValidUntil(updatedVoucherModel.getValidUntil());

        voucherRepository.save(existingVoucherModel);
        return VoucherMapper.INSTANCE.voucherToVoucherDto(existingVoucherModel);
    }

    public void deleteVoucher(Long id) {
        voucherRepository.deleteById(id);
    }
}
