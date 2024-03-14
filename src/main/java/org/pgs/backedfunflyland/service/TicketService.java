package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.TicketDto;
import org.pgs.backedfunflyland.mapper.TicketMapper;
import org.pgs.backedfunflyland.model.TicketModel;
import org.pgs.backedfunflyland.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<TicketDto> getAllTickets() {
        return ticketRepository.findAll().stream()
                .map(TicketMapper.INSTANCE::ticketToTicketDto)
                .collect(Collectors.toList());
    }

    public TicketDto getTicketById(Long id) {
        TicketModel ticketModel = ticketRepository.findById(id).orElse(null);
        return TicketMapper.INSTANCE.ticketToTicketDto(ticketModel);
    }

    public TicketDto createTicket(TicketDto ticketDto) {
        TicketModel ticketModel = TicketMapper.INSTANCE.ticketDtoToTicket(ticketDto);
        ticketModel = ticketRepository.save(ticketModel);
        return TicketMapper.INSTANCE.ticketToTicketDto(ticketModel);
    }

    public TicketDto updateTicket(Long id, TicketDto ticketDto) {
        TicketModel ticketModel = TicketMapper.INSTANCE.ticketDtoToTicket(ticketDto);
        ticketModel.setId(id); // Set ID from path variable
        ticketModel = ticketRepository.save(ticketModel);
        return TicketMapper.INSTANCE.ticketToTicketDto(ticketModel);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
