package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.VoucherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepository extends JpaRepository<VoucherModel, Long> {
    // You can add custom query methods here if needed
}
