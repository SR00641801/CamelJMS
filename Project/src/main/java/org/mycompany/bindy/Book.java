package org.mycompany.bindy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.camel.component.jpa.Consumed;

@Entity
@Table(name = "books")
//@NamedNativeQuery(name = "newbooks", query = "select * from book m where m.items = 'Camel'")

public class Book {

    @Id
    @GeneratedValue
    private int id;

    private String item;

    private String description;

    private boolean processed;
    
	
    @Consumed
    public void setProcessed() {
        processed = true;
    }
	 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", item=" + item + ", description=" + description + "]";
	}
}
