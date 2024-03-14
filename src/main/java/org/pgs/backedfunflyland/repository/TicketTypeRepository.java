package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.TicketTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTypeRepository extends JpaRepository<TicketTypeModel, Long> {
    // You can add custom query methods here if needed
}
