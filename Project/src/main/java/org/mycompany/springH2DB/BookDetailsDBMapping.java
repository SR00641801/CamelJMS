package org.mycompany.springH2DB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Bean")
@XmlAccessorType(XmlAccessType.FIELD)

public class BookDetailsDBMapping{
@XmlElement(name = "ID")
private int id;
@XmlElement(name = "ITEM")
private String item;
@XmlElement(name = "DESCRIPTION")
private String description;

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
}
