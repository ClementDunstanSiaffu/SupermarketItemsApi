/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarketItemsApi.supermarketItemApi;

/**
 *
 * @author clement
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequestMapping("/")

public class ControllerClass {
    
    private ItemRepository itemRepository;
    
    @Autowired
    
    public ControllerClass(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    
    @RequestMapping(value = "/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public List<Items> getContents (@PathVariable("itemId") int itemId){
        return itemRepository.findAll();
    }
    
    
    @GetMapping("/{itemId}/{expire}/{itemName}/{availability}")
    @ResponseBody
    public String saveContents (
            @PathVariable int itemId,
            @PathVariable boolean expire,
            @PathVariable String itemName,
            @PathVariable boolean availability
        ){
        Items items = itemRepository.findItemById(itemId);
        if (items != null){
            items.setExpireStatus(expire);
            items.setItemName(itemName);
            items.setAvailability(availability);
            itemRepository.save(items);
            
        }else{
           itemRepository.save(new Items(itemId,expire,itemName,availability));
        }
        return "saved";
    }
    
}
