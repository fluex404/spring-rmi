package com.fluex404.SpringRmiServer.config;

import com.fluex404.SpringRmiServer.service.HelloWorldRMI;
import com.fluex404.SpringRmiServer.service.HelloWorldRMIimpl;
import com.sun.jmx.remote.internal.RMIExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config {

    @Bean
    RemoteExporter registerRMIExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("helloworldrmi");
        exporter.setServiceInterface(HelloWorldRMI.class);
        exporter.setService(new HelloWorldRMIimpl());

        return exporter;
    }

}
