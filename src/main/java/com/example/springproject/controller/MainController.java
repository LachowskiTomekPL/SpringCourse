package com.example.springproject.controller;

import com.example.springproject.entity.Item;
import com.example.springproject.repository.ItemRepository;
import com.example.springproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MainController {
@Autowired
    ItemService itemService;


    @RequestMapping("/hello")
    public String index(HttpServletResponse response){
        response.addHeader("Spring","kurs");
        Item item = new Item();
        item.setName("Car");
        item.setPrice("1000PLN");
        itemService.saveItem(item);
        return "Hello World";
    }
}
