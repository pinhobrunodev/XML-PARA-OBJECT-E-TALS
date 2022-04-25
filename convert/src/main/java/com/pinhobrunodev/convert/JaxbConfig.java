package com.pinhobrunodev.convert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JaxbConfig {


    @Bean
    public Jaxb2Marshaller jaxb2Marshaller(
            @Value("${context.path}") final String contextPath,
            @Value("${schema.path}") final Resource schemaResource
    ) {
        var marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(contextPath);
        marshaller.setSchema(schemaResource);

        Map<String, Object> property = new HashMap<>();
        property.put(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setMarshallerProperties(property);
        return marshaller;
    }


}
