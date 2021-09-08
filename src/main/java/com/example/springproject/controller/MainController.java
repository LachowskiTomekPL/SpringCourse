package com.example.springproject.controller;

import com.example.springproject.entity.Item;
import com.example.springproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    ItemService itemService;


    @RequestMapping("/quantity")
    public List<Item> quantityOverTwenty(HttpServletResponse response) {

        return itemService.getItemswithQuantityOverTwenty();
    }

    @RequestMapping("/quantityOver")
    public List<Item> quantityOverAnyValue(@RequestParam(name = "quantity") Optional<Integer> quantityParam) {
        int quantity = 100;
        if (quantityParam.isPresent()) {
            quantity = quantityParam.get();
        }

        return itemService.getItemWithQuantityOver(quantity);
    }
}
