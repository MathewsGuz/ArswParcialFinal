/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialfinal.controller;

import com.mycompany.parcialfinal.services.ConcurrenceTest;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author 2108263
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TemperatureApiControllerTest {
    @LocalServerPort
    private int port;
    ArrayList<ConcurrenceTest> hilos = new ArrayList<>();

    
    public TemperatureApiControllerTest() {
        
    }

    @Test
    public void testGetTempF() {
         for(int i=0 ; i<10;i++){
            hilos.add(new ConcurrenceTest());
            hilos.get(i).connect("http://localhost:"+port+"/temp/F/10");
        }
        
        hilos.get(0).start();
        hilos.get(1).start();
        hilos.get(2).start();
        hilos.get(3).start();
        hilos.get(4).start();
        hilos.get(5).start();
        hilos.get(6).start();
        hilos.get(7).start();
        hilos.get(8).start();
        hilos.get(9).start();

        
    }

   
}
