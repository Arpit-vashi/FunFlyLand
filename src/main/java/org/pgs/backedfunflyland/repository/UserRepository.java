package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    // You can add custom query methods here if needed
    UserModel findByUsername(String username);
}
