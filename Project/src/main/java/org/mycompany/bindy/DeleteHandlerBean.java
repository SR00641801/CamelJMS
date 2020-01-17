package org.mycompany.bindy;

import javax.persistence.EntityManager;

import org.apache.camel.Exchange;
import org.apache.camel.component.jpa.DeleteHandler;
import org.springframework.stereotype.Component;

@Component("orderProcessedMarker")
public class DeleteHandlerBean {
	
	public DeleteHandler<Book> createOrderProcessHandler() {
	    return new DeleteHandler<Book>() {
			@Override
			public void deleteObject(EntityManager arg0, Object arg1, Exchange arg2) {
				// TODO Auto-generated method stub
				((Book) arg1).setProcessed(true);
			}
	    };
	}
}
