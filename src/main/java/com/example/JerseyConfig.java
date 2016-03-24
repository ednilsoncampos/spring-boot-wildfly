/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author ednilson
 */
@Component
//TODO: comment @ApplicationPath and enable spring.jersey.applicationPath=services
// dont work 
@ApplicationPath("services")
// dont work 
//@ApplicationPath("/*")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Endpoint.class);
    }

}
