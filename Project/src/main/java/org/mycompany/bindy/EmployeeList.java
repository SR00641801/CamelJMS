
package org.mycompany.bindy;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.OneToMany;

@XmlRootElement(name = "EmployeeList")
@XmlAccessorType(XmlAccessType.FIELD)

public class EmployeeList {

	@XmlElement  (name = "EmployeeCSVList") 
	List<EmployeeCSV2Xml> employeecsvlist;

	public List<EmployeeCSV2Xml> getEmployeecsvlist() {
		return employeecsvlist;
	}

	public void setEmployeecsvlist(List<EmployeeCSV2Xml> employeecsvlist) {
		this.employeecsvlist = employeecsvlist;
	}

	@Override
	public String toString() {
		return "EmployeeList [employeecsvlist=" + employeecsvlist + "]";
	}

	
}
