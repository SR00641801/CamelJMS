package org.mycompany.bindy;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MyAggregationStrategy implements AggregationStrategy{
	List<EmployeeCSV2Xml> listem= new ArrayList();
	EmployeeList listofEmployee= new EmployeeList();
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		System.out.println("Inside Aggregation");
		if(oldExchange == null) {
			EmployeeCSV2Xml body= newExchange.getIn().getBody(EmployeeCSV2Xml.class);
			System.out.println("Inside Aggregation if:::: "+ body);
			listem.add(body);
			return newExchange;
		}
		else {
			EmployeeCSV2Xml csvbody= newExchange.getIn().getBody(EmployeeCSV2Xml.class);
			System.out.println("Inside Aggregation else :::: " + csvbody);
			listem.add(csvbody);
			listofEmployee.setEmployeecsvlist(listem);
			oldExchange.getIn().setBody(listofEmployee);
	        return oldExchange;
		}
		
	}

}
