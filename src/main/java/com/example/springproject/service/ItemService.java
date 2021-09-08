package com.example.springproject.service;

import com.example.springproject.entity.Item;

import java.util.List;

public interface ItemService {

    public void saveItem(Item item);
    public List<Item> getItemswithQuantityOverTwenty();
}
