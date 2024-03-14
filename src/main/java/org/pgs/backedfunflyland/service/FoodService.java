package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.FoodDto;
import org.pgs.backedfunflyland.mapper.FoodMapper;
import org.pgs.backedfunflyland.model.FoodModel;
import org.pgs.backedfunflyland.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<FoodDto> getAllFoods() {
        return foodRepository.findAll().stream()
                .map(FoodMapper.INSTANCE::foodToFoodDto)
                .collect(Collectors.toList());
    }

    public FoodDto getFoodById(Long id) {
        FoodModel foodModel = foodRepository.findById(id).orElse(null);
        return FoodMapper.INSTANCE.foodToFoodDto(foodModel);
    }

    public FoodDto createFood(FoodDto foodDto) {
        FoodModel foodModel = FoodMapper.INSTANCE.foodDtoToFood(foodDto);
        foodModel = foodRepository.save(foodModel);
        return FoodMapper.INSTANCE.foodToFoodDto(foodModel);
    }

    public FoodDto updateFood(Long id, FoodDto foodDto) {
        FoodModel foodModel = FoodMapper.INSTANCE.foodDtoToFood(foodDto);
        foodModel.setId(id); // Set ID from path variable
        foodModel = foodRepository.save(foodModel);
        return FoodMapper.INSTANCE.foodToFoodDto(foodModel);
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
}
