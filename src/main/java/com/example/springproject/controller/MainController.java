package com.example.springproject.controller;

import com.example.springproject.entity.Item;
import com.example.springproject.repository.ItemRepository;
import com.example.springproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MainController {
@Autowired
    ItemService itemService;


    @RequestMapping("/hello")
    public List<Item> index(HttpServletResponse response){

        return itemService.getItemswithQuantityOverTwenty();
    }
}
