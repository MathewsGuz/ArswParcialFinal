/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialfinal.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2108263
 */
@Service
public class TempServices implements TemperatureService {
    
    public int hot;
    public String answer;
    
    @Override
    public String convertToF(String value){
            hot=Integer.valueOf(value)*(9/5) + 32;
            answer=String.valueOf((Integer.valueOf(value)*(1.8)) + 32);  
        return answer;
    }

    @Override
    public String convertToC(String value) {
//       hot = (Integer.valueOf(value)-32)/(1.8);
       answer=String.valueOf((Integer.valueOf(value)-32)/(1.8));
       return answer;
    }
    
}
