/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialfinal.controller;

import com.mycompany.parcialfinal.services.TempServices;
import com.mycompany.parcialfinal.services.TemperatureService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2108263
 */
@RestController
@RequestMapping(value = "/temp")
@Service
public class TemperatureApiController {
    @Autowired
    TemperatureService temp;
    
    @RequestMapping(method = RequestMethod.GET,value="/F/{value}")
    public ResponseEntity<?> getTempF(@PathVariable("value") String hot){
        try{
            return new ResponseEntity<>(temp.convertToF(hot),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(TempServices.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,value="/C/{value}")
    public ResponseEntity<?> getTempC(@PathVariable("value") String hot){
        try{
            return new ResponseEntity<>(temp.convertToC(hot),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(TempServices.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
}
