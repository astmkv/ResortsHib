package com.service;

import com.ResTableEntity;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<String> convertToString(List<ResTableEntity> res){
        List<String> results = new ArrayList<>();
                for (int i = 0; i < res.size(); i++){
                    results.add(res.get(i).getName() + " " +
                            res.get(i).getCountry() + " " +
                            res.get(i).getSeason() + " " +
                            res.get(i).getPrice());
                }
        return results;
    }

    public static String getResort(ResTableEntity res){
        String s = res.getName() + " " +
                res.getCountry() + " " +
                res.getSeason() + " " +
                res.getPrice();
        return s;
    }
}
