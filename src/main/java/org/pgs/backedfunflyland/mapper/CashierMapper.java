package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.CashierDto;
import org.pgs.backedfunflyland.model.CashierModel;
@Mapper
public interface CashierMapper {
    CashierMapper INSTANCE = Mappers.getMapper(CashierMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            // Add mappings for additional fields
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "joiningDate", target = "joiningDate")
    })
    CashierDto cashierToCashierDto(CashierModel cashierModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            // Add mappings for additional fields
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "joiningDate", target = "joiningDate")
    })
    CashierModel cashierDtoToCashier(CashierDto cashierDto);
}
