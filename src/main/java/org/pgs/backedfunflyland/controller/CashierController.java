package org.pgs.backedfunflyland.controller;

import org.pgs.backedfunflyland.dto.CashierDto;
import org.pgs.backedfunflyland.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashiers")
public class CashierController {

    private final CashierService cashierService;

    @Autowired
    public CashierController(CashierService cashierService) {
        this.cashierService = cashierService;
    }

    @GetMapping
    public ResponseEntity<List<CashierDto>> getAllCashiers() {
        List<CashierDto> cashiers = cashierService.getAllCashiers();
        return ResponseEntity.ok(cashiers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CashierDto> getCashierById(@PathVariable Long id) {
        CashierDto cashierDto = cashierService.getCashierById(id);
        return ResponseEntity.ok(cashierDto);
    }

    @PostMapping
    public ResponseEntity<CashierDto> createCashier(@RequestBody CashierDto cashierDto) {
        CashierDto createdCashier = cashierService.createCashier(cashierDto);
        return new ResponseEntity<>(createdCashier, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CashierDto> updateCashier(@PathVariable Long id, @RequestBody CashierDto cashierDto) {
        CashierDto updatedCashier = cashierService.updateCashier(id, cashierDto);
        return ResponseEntity.ok(updatedCashier);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCashier(@PathVariable Long id) {
        cashierService.deleteCashier(id);
        return ResponseEntity.noContent().build();
    }
}
