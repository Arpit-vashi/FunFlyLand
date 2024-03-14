package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.TicketDto;
import org.pgs.backedfunflyland.model.TicketModel;

@Mapper
public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "promotionCode", target = "promotionCode"),
            @Mapping(source = "numberOfAdults", target = "numberOfAdults"),
            @Mapping(source = "numberOfChildren", target = "numberOfChildren"),
            @Mapping(source = "ticketType", target = "ticketType"),
            @Mapping(source = "foodOption", target = "foodOption"),
            @Mapping(source = "totalAmount", target = "totalAmount"),
            @Mapping(source = "taxAmount", target = "taxAmount"),
            @Mapping(source = "paymentMethod", target = "paymentMethod"),
            @Mapping(source = "date", target = "date")
    })
    TicketDto ticketToTicketDto(TicketModel ticketModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "promotionCode", target = "promotionCode"),
            @Mapping(source = "numberOfAdults", target = "numberOfAdults"),
            @Mapping(source = "numberOfChildren", target = "numberOfChildren"),
            @Mapping(source = "ticketType", target = "ticketType"),
            @Mapping(source = "foodOption", target = "foodOption"),
            @Mapping(source = "totalAmount", target = "totalAmount"),
            @Mapping(source = "taxAmount", target = "taxAmount"),
            @Mapping(source = "paymentMethod", target = "paymentMethod"),
            @Mapping(source = "date", target = "date")
    })
    TicketModel ticketDtoToTicket(TicketDto ticketDto);
}
