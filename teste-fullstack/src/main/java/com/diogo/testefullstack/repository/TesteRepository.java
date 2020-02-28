package com.diogo.testefullstack.repository;

import com.diogo.testefullstack.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository  extends JpaRepository<Item, Long> {
}
