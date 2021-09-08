package com.example.springproject.repository;

import com.example.springproject.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
@Query("select i from Item i where i.quantity>20")
public List<Item> getItemswithQuantityOverTwenty();

@Query("select  i from Item i where i.quantity>:minQuantity")
public List<Item> getItemWithQuantityOver(@Param("minQuantity") int minQuantity);

@Query("select i from Item i where i.name like :regex")
public List<Item> getItemsWithNameLike(@Param("regex") String regex);

}


