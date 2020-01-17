package org.mycompany.springH2DB;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="BookRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookRequest {
	@XmlElement(name="BookDetails")
	private List<BookDetails> bookDetails;

	public List<BookDetails> getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(List<BookDetails> bookDetails) {
		this.bookDetails = bookDetails;
	}
	
	
}