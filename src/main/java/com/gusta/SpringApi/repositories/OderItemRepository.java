package com.gusta.SpringApi.repositories;

import com.gusta.SpringApi.entities.OrderItem;
import com.gusta.SpringApi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderItemRepository extends JpaRepository<OrderItem, Long> {
}
