package com.example.springproject.service;

import com.example.springproject.entity.Item;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemService {

    public void saveItem(Item item);
    public List<Item> getItemswithQuantityOverTwenty();
    public List<Item> getItemWithQuantityOver(int minQuantity);
    public List<Item> getItemsWithNameLike(String regex);
}
