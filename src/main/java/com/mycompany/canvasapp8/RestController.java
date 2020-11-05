/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.canvasapp8;

   
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author Lukas
 */
public class RestController {
    private static final Client CLIENT = ClientBuilder.newClient();

    public RestController(){
        WebTarget studentService = CLIENT.target(getBaseURI()); 
        String response = studentService.request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(response);
    }
    
    private static URI getBaseURI(){
        return UriBuilder.fromUri("http://localhost:8080/Assignment3_d0031N/resources/ladok/D0031N/0005").build();
    } 
}
