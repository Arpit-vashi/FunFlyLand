package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.CashierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashierRepository extends JpaRepository<CashierModel, Long> {
    // You can add custom query methods here if needed
    CashierModel findByUsername(String username);
}
