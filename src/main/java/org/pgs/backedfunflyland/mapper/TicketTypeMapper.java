package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.TicketTypeDto;
import org.pgs.backedfunflyland.model.TicketTypeModel;

@Mapper
public interface TicketTypeMapper {
    TicketTypeMapper INSTANCE = Mappers.getMapper(TicketTypeMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "ticketTypeName"), // Map to 'ticketTypeName'
            @Mapping(source = "price", target = "ticketTypePrice"), // Map to 'ticketTypePrice'
            @Mapping(source = "ticketSpeed", target = "ticketSpeed"),
            @Mapping(source = "promotion", target = "promotion") // Map to 'promotion'
    })
    TicketTypeDto ticketTypeModelToTicketTypeDto(TicketTypeModel ticketTypeModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "ticketTypeName", target = "name"), // Map to 'name'
            @Mapping(source = "ticketTypePrice", target = "price"), // Map to 'price'
            @Mapping(source = "ticketSpeed", target = "ticketSpeed"),
            @Mapping(source = "promotion", target = "promotion") // Map to 'isPromotion'
    })
    TicketTypeModel ticketTypeDtoToTicketTypeModel(TicketTypeDto ticketTypeDto);
}
