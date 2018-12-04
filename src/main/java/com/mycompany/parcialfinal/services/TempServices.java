/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialfinal.services;

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
    public String convert(String value,String letter){
        if(letter=="F"){
            hot=Integer.valueOf(value)*(9/5) + 32;
            answer=String.valueOf(Integer.valueOf(value)*(9/5) + 32);
        }
        else if(letter=="C"){
            hot = (Integer.valueOf(value)-32)/(9/5);
            answer=String.valueOf((Integer.valueOf(value)-32)/(9/5));  
        }
        return answer;
    }
}
