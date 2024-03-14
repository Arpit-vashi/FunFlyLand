package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
    // You can add custom query methods here if needed
}
