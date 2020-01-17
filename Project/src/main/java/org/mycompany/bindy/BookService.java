package org.mycompany.bindy;

import java.util.LinkedHashMap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BookService implements Processor{
	private static final transient Logger LOG = LoggerFactory.getLogger(BookService.class);
	Book book=new Book();
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//As after spliting body is changing to linkedHashMap hence to get the bosy LinkedHashMap needs to be used. 
		//and then set the body to Book class
		
		LinkedHashMap<String, Object> response =exchange.getIn().getBody(java.util.LinkedHashMap.class);
		
		Object item = response.get("item");
		Object description = response.get("description");
		boolean processed = (boolean) response.get("processed");
		
		int id1=(int) response.get("id");
		
		LOG.info("item ::" + item);
		
		book.setItem(item.toString());
		book.setDescription(description.toString());
		book.setId(id1);
		book.setProcessed(processed);
		
		exchange.getIn().setBody(book);
		
	}

}
