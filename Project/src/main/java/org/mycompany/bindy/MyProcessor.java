/*
 * package org.mycompany.bindy;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.apache.camel.Exchange; import org.apache.camel.Processor; import
 * org.apache.log4j.Logger;
 * 
 * public class MyProcessor implements Processor {
 * 
 * static Logger logger = Logger.getLogger(MyProcessor.class);
 * List<EmployeeList> listem = new ArrayList<>();
 * 
 * @Override public void process(Exchange exchange) throws Exception { // TODO
 * Auto-generated method stub EmployeeCSV body=
 * exchange.getIn().getBody(EmployeeCSV.class);
 * 
 * 
 * EmployeeList list= new EmployeeList(); List<EmployeeCSV> listcsv= new
 * ArrayList<>();
 * 
 * listcsv.add(body);
 * 
 * 
 * 
 * EmployeeCSV2Xml CSV2Xml = new EmployeeCSV2Xml();
 * 
 * List<EmployeeCSV2Xml> listXml = new ArrayList<EmployeeCSV2Xml>();
 * 
 * 
 * CSV2Xml.setEmployeeId(body.getEmployeeId());
 * CSV2Xml.setEmployeeName(body.getEmployeeName());
 * CSV2Xml.setSalary(body.getSalary());
 * 
 * listXml.add(CSV2Xml);
 * 
 * list.setEmployeecsvlist(listcsv); listem.add(list);
 * exchange.getIn().setBody(listem); logger.info("Body is :::: "+ list);
 * 
 * }
 * 
 * }
 */