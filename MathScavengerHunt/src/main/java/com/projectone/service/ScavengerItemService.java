package com.projectone.service;

import com.projectone.model.ScavengerItem;
import com.projectone.repository.ScavengerItemRepository;

import java.util.List;

public class ScavengerItemService {
    ScavengerItemRepository sr;
    public ScavengerItemService(){
        sr = new ScavengerItemRepository();
    }
    public List<ScavengerItem> getAllScavengerItems(){
        return sr.getAllScavengerItems();
    }
    public ScavengerItem getScavengerItemById(int id){
        return sr.getScavengerItemById(id);
    }
    public boolean addScavengerItem(ScavengerItem s){
        if(sr.getScavengerItemById(s.getId()) == null){
            return sr.addScavengerItem(s);
        }else{
            return false;
        }
    }
}
