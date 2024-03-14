package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.FoodDto;
import org.pgs.backedfunflyland.model.FoodModel;

@Mapper
public interface FoodMapper {
    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "imageUrl", target = "imageUrl")
    })
    FoodDto foodToFoodDto(FoodModel foodModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "imageUrl", target = "imageUrl")
    })
    FoodModel foodDtoToFood(FoodDto foodDto);
}
