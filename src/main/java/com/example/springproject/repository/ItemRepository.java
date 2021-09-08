package com.example.springproject.repository;

import com.example.springproject.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
@Query("select i from Item i where i.quantity>20")
public List<Item> getItemswithQuantityOverTwenty();
}
