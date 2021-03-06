package org.mycompany.bindy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlRootElement  (name = "EmployeeCSVList") 
@XmlAccessorType(XmlAccessType.FIELD)
@CsvRecord(separator = ",")
public class EmployeeCSV2Xml {
		@XmlElement(name = "EmployeeID")
		@DataField(pos = 1)
		private int employeeId;
		@XmlElement(name = "EmployeeName")
		@DataField(pos = 2)
		private String employeeName;
		@XmlElement(name = "EmployeeSalary")
		@DataField(pos = 3)
		private int salary;
		
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
	
	  @Override public String toString() { return "EmployeeCSV [employeeId=" +
	  employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]"; }
	 
		
		
}
