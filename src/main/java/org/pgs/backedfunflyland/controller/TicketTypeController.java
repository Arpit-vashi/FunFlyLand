package org.pgs.backedfunflyland.controller;

import org.pgs.backedfunflyland.dto.TicketTypeDto;
import org.pgs.backedfunflyland.service.TicketTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket-types")
public class TicketTypeController {

    private final TicketTypeService ticketTypeService;

    @Autowired
    public TicketTypeController(TicketTypeService ticketTypeService) {
        this.ticketTypeService = ticketTypeService;
    }

    @GetMapping
    public ResponseEntity<List<TicketTypeDto>> getAllTicketTypes() {
        List<TicketTypeDto> ticketTypes = ticketTypeService.getAllTicketTypes();
        return ResponseEntity.ok(ticketTypes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketTypeDto> getTicketTypeById(@PathVariable Long id) {
        TicketTypeDto ticketType = ticketTypeService.getTicketTypeById(id);
        if (ticketType != null) {
            return ResponseEntity.ok(ticketType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<TicketTypeDto> createTicketType(@RequestBody TicketTypeDto ticketType) {
        TicketTypeDto createdTicketType = ticketTypeService.createTicketType(ticketType);
        return new ResponseEntity<>(createdTicketType, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TicketTypeDto> updateTicketType(@PathVariable Long id, @RequestBody TicketTypeDto ticketType) {
        TicketTypeDto updatedTicketType = ticketTypeService.updateTicketType(id, ticketType);
        if (updatedTicketType != null) {
            return ResponseEntity.ok(updatedTicketType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicketType(@PathVariable Long id) {
        ticketTypeService.deleteTicketType(id);
        return ResponseEntity.noContent().build();
    }
}
