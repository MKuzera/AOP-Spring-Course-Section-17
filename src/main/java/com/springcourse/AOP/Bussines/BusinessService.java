package com.springcourse.AOP.Bussines;

import com.springcourse.AOP.DataService.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int calculateMax(){
        int[] data = dataService.retrieveData();

        return Arrays.stream(data).max().orElse(0);

    }
}
