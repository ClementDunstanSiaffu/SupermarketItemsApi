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
import java.time.LocalDate;
import java.time.LocalTime;

public class Items {
    
    @Id
    private int id;
    private boolean expire;
    private String itemName;
    private boolean availability;
    private LocalDate date;
    private LocalTime time;
    
    public Items(
            int id,
            boolean expire,
            String itemName,
            boolean availability,
            LocalDate date,
            LocalTime time
    ){
        this.id = id;
        this.expire = expire;
        this.itemName = itemName;
        this.availability = availability;
        this.date = date;
        this.time = time;

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
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public void setTime(LocalTime time){
        this.time = time;
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
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public LocalTime getTime(){
        return this.time;
    }
}
