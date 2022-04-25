package com.pinhobrunodev.convert;

import br.telefonica.customer.customerinformationmgmt.customerprofilemanagement.registerprepaidcustomerrequest.v2.ObjectFactory;
import br.telefonica.customer.customerinformationmgmt.customerprofilemanagement.registerprepaidcustomerrequest.v2.RegisterPrePaidCustomerRequest;
import com.pinhobrunodev.convert.stub.TefHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

@Slf4j
@SpringBootApplication
public class ConvertApplication implements CommandLineRunner {

	@Autowired
	private Jaxb2Marshaller marshaller;


	public static void main(String[] args) {
		SpringApplication.run(ConvertApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		TefHeader tefHeader = new TefHeader();
		RegisterPrePaidCustomerRequest request = new RegisterPrePaidCustomerRequest();
		StringWriter writer = new StringWriter();

		var xml = writer.toString();
		log.info("XML: {}",xml);
	}
}
