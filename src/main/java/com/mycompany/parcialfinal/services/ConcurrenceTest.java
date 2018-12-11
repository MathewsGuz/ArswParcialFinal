/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialfinal.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 2108263
 */
public class ConcurrenceTest extends Thread {

    private static final String USER_AGENT = "Mozilla/5.0";
    private String url;
    private String result;
    private int responseCode;
    
    @Override
    public void run(){
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            StringBuffer response = new StringBuffer();
            //The following invocation perform the connection implicitly before getting the code
            responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);
            
            if (responseCode == HttpURLConnection.HTTP_ACCEPTED) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
            } else {
                System.out.println("GET request not worked");
            }
            
            System.out.println("GET DONE");
            result= response.toString();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ConcurrenceTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConcurrenceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void connect(String url) {
        this.url=url;
    }


    public int getResponseCode() {
        return responseCode;
    }
    
}
