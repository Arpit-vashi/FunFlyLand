package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.VoucherDto;
import org.pgs.backedfunflyland.model.VoucherModel;

@Mapper
public interface VoucherMapper {
    VoucherMapper INSTANCE = Mappers.getMapper(VoucherMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "discount", target = "discount"),
            @Mapping(source = "validForNumberOfCustomers", target = "validForNumberOfCustomers"),
            @Mapping(source = "validForNumberOfDays", target = "validForNumberOfDays")
    })
    VoucherDto voucherToVoucherDto(VoucherModel voucherModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "discount", target = "discount"),
            @Mapping(source = "validForNumberOfCustomers", target = "validForNumberOfCustomers"),
            @Mapping(source = "validForNumberOfDays", target = "validForNumberOfDays")
    })
    VoucherModel voucherDtoToVoucher(VoucherDto voucherDto);
}
