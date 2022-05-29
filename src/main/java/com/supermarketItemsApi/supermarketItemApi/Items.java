/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarketItemsApi.supermarketItemApi;

/**
 *
 * @author clement
 */
import org.springframework.data.annotation.Id;

public class Items {
    
    @Id
    private int id;
    private boolean expire;
    private String itemName;
    private boolean availability;
    
    public Items(
            int id,
            boolean expire,
            String itemName,
            boolean availability
    ){
        this.id = id;
        this.expire = expire;
        this.itemName = itemName;
        this.availability = availability;

    }
            
    public int getId(){
        return this.id;
    }
    
    public void setExpireStatus(boolean expire){
        this.expire = expire;
    }
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
       
    public boolean getExpireStatus(){
        return this.expire;
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public boolean getAvailability(){
        return this.availability;
    }
}
