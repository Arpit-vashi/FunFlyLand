package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.TicketTypeDto;
import org.pgs.backedfunflyland.mapper.TicketTypeMapper;
import org.pgs.backedfunflyland.model.TicketTypeModel;
import org.pgs.backedfunflyland.repository.TicketTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketTypeService {

    private final TicketTypeRepository ticketTypeRepository;

    @Autowired
    public TicketTypeService(TicketTypeRepository ticketTypeRepository) {
        this.ticketTypeRepository = ticketTypeRepository;
    }

    public List<TicketTypeDto> getAllTicketTypes() {
        List<TicketTypeModel> ticketTypeModels = ticketTypeRepository.findAll();
        return ticketTypeModels.stream()
                .map(TicketTypeMapper.INSTANCE::ticketTypeModelToTicketTypeDto)
                .collect(Collectors.toList());
    }

    public TicketTypeDto getTicketTypeById(Long id) {
        TicketTypeModel ticketTypeModel = ticketTypeRepository.findById(id).orElse(null);
        return TicketTypeMapper.INSTANCE.ticketTypeModelToTicketTypeDto(ticketTypeModel);
    }

    public TicketTypeDto createTicketType(TicketTypeDto ticketTypeDto) {
        TicketTypeModel ticketTypeModel = TicketTypeMapper.INSTANCE.ticketTypeDtoToTicketTypeModel(ticketTypeDto);
        ticketTypeModel = ticketTypeRepository.save(ticketTypeModel);
        return TicketTypeMapper.INSTANCE.ticketTypeModelToTicketTypeDto(ticketTypeModel);
    }

    public TicketTypeDto updateTicketType(Long id, TicketTypeDto ticketTypeDto) {
        TicketTypeModel ticketTypeModel = TicketTypeMapper.INSTANCE.ticketTypeDtoToTicketTypeModel(ticketTypeDto);
        ticketTypeModel.setId(id); // Set ID from path variable
        ticketTypeModel = ticketTypeRepository.save(ticketTypeModel);
        return TicketTypeMapper.INSTANCE.ticketTypeModelToTicketTypeDto(ticketTypeModel);
    }

    public void deleteTicketType(Long id) {
        ticketTypeRepository.deleteById(id);
    }
}
