package com.example.springproject.service.impl;

import com.example.springproject.entity.Item;
import com.example.springproject.repository.ItemRepository;
import com.example.springproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }
}
