package com.springcourse.AOP.DataService;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DataService {
    public int[] retrieveData(){
        return new int[] {30,10,200,10,20,1,22};
    }
}
