/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.supermarketItemsApi.supermarketItemApi;


/**
 *
 * @author clement
 */


import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ItemRepository extends MongoRepository<Items,Integer> {
    
    public Items findItemById(int itemId);
}
