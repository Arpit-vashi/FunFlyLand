package org.pgs.backedfunflyland.controller;

import org.pgs.backedfunflyland.dto.VoucherDto;
import org.pgs.backedfunflyland.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vouchers")
public class VoucherController {

    private final VoucherService voucherService;

    @Autowired
    public VoucherController(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    @GetMapping
    public ResponseEntity<List<VoucherDto>> getAllVouchers() {
        List<VoucherDto> vouchers = voucherService.getAllVouchers();
        return ResponseEntity.ok(vouchers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VoucherDto> getVoucherById(@PathVariable Long id) {
        VoucherDto voucherDto = voucherService.getVoucherById(id);
        return ResponseEntity.ok(voucherDto);
    }

    @PostMapping
    public ResponseEntity<VoucherDto> createVoucher(@RequestBody VoucherDto voucherDto) {
        VoucherDto createdVoucher = voucherService.createVoucher(voucherDto);
        return new ResponseEntity<>(createdVoucher, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VoucherDto> updateVoucher(@PathVariable Long id, @RequestBody VoucherDto voucherDto) {
        VoucherDto updatedVoucher = voucherService.updateVoucher(id, voucherDto);
        return ResponseEntity.ok(updatedVoucher);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVoucher(@PathVariable Long id) {
        voucherService.deleteVoucher(id);
        return ResponseEntity.noContent().build();
    }
}
