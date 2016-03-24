/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ednilson
 */
@Component
@Path("/hello")
public class Endpoint {

    @Autowired
    private DemoRepository demoRepository;

    @GET
    public String message() {
        if (demoRepository != null) {
            return "Jersey spring boot in wildfly ok!";
        } else {
            return "************ Spring context not initialized. ************";
        }
    }
}
