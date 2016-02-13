package com.walmart.grocery.converter;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.DeserializationConfig;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.walmart.grocery.model.Gorder;
import com.walmart.grocery.model.TSOrder;

public class JacksonParser {
//	public static void main(String args[]) {
//		JacksonParser parser = new JacksonParser();
//		parser.run();
//	}
	
	private void run() {
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			
			Gorder gorder = mapper.readValue( new File( "/Users/sgovind/Downloads/test.json"), Gorder.class);
			System.out.println(gorder.toString());
			Object j = gorder.getTSOrder().getOrderInfo().getOrderLine().get(0);
			System.out.println(j.toString());
			
			
		} catch ( IOException e) {
			e.printStackTrace();
	
		}
	}
}
