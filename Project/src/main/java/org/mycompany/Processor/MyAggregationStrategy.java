package org.mycompany.Processor;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;



public class MyAggregationStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        
    	System.out.println("Inside Aggregation STrategy");
    	if (oldExchange == null) {
        	
            return newExchange;
        }

    	String num1 = oldExchange.getIn().getBody(String.class);
    	String num2 = newExchange.getIn().getBody(String.class);

        oldExchange.getIn().setBody(num1+num2);

        return oldExchange;
    }

}