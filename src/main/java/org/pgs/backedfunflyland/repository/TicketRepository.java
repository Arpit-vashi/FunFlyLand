package org.pgs.backedfunflyland.repository;

import org.pgs.backedfunflyland.model.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketModel, Long> {
    // You can add custom query methods here if needed
}
