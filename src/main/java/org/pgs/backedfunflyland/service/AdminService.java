package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.AdminDto;
import org.pgs.backedfunflyland.model.AdminModel;
import org.pgs.backedfunflyland.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<AdminDto> getAllAdmins() {
        return adminRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public AdminDto getAdminById(Long id) {
        AdminModel adminModel = adminRepository.findById(id).orElse(null);
        return convertToDto(adminModel);
    }

    public AdminDto createAdmin(AdminDto adminDto) {
        AdminModel adminModel = convertToEntity(adminDto);
        adminModel = adminRepository.save(adminModel);
        return convertToDto(adminModel);
    }

    public AdminDto updateAdmin(Long id, AdminDto adminDto) {
        AdminModel adminModel = convertToEntity(adminDto);
        adminModel.setId(id); // Set ID from path variable
        adminModel = adminRepository.save(adminModel);
        return convertToDto(adminModel);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    // Helper method to convert AdminDto to AdminModel
    private AdminModel convertToEntity(AdminDto adminDto) {
        AdminModel adminModel = new AdminModel();
        adminModel.setId(adminDto.getId());
        adminModel.setUsername(adminDto.getUsername());
        adminModel.setPassword(adminDto.getPassword());
        return adminModel;
    }

    // Helper method to convert AdminModel to AdminDto
    private AdminDto convertToDto(AdminModel adminModel) {
        if (adminModel == null) {
            return null;
        }
        AdminDto adminDto = new AdminDto();
        adminDto.setId(adminModel.getId());
        adminDto.setUsername(adminModel.getUsername());
        adminDto.setPassword(adminModel.getPassword());
        return adminDto;
    }
}
