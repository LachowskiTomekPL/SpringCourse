package com.example.springproject.service.impl;

import com.example.springproject.entity.Item;
import com.example.springproject.repository.ItemRepository;
import com.example.springproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> getItemswithQuantityOverTwenty() {
        return itemRepository.getItemswithQuantityOverTwenty();
    }

    @Override
    public List<Item> getItemWithQuantityOver(int minQuantity) {
        return itemRepository.getItemWithQuantityOver(minQuantity);
    }

    @Override
    public List<Item> getItemsWithNameLike(String regex) {
        return itemRepository.getItemsWithNameLike(regex);
    }
}
