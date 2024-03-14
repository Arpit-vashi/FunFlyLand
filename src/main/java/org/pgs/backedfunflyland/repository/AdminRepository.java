package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminModel, Long> {
    // You can add custom query methods here if needed
    AdminModel findByUsername(String username);
}
