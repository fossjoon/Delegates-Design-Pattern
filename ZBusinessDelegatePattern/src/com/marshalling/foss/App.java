package com.marshalling.foss;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App 
{
	static Employees employees = new Employees();
	static {
		employees.setPersons(new ArrayList<Person>());
		employees.setEmployees(new ArrayList<Employee>());
		Person person = new Person();
		person.setId(2);
		person.setHome_Address("Pathradi");
		person.setCity("Gurgaon");
		person.setPhone_No("9650274628");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("FOSS");
		emp.setLastName("JOON");
		emp.setIncome(100.00);
		employees.getEmployees().add(emp);
		employees.getPersons().add(person);
	}
    public static void main( String[] args ) throws JAXBException
    {
    	marshallingExample();
    	System.out.println("==================================================");
    	unmarshallingExample();
        System.out.println( "Hello World!" );
    }
	private static void unmarshallingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller jaxbunmarshaller =  jaxbContext.createUnmarshaller();
		Employees emps  = (Employees) jaxbunmarshaller.unmarshal(new File("D://joon//employees.xml"));
		for (Employee emp  : emps.getEmployees()) {
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getIncome());
		}
		for (Person obj : emps.getPersons()) {
			System.out.println(obj.getId());
			System.out.println(obj.getHome_Address());
			System.out.println(obj.getCity());
			System.out.println(obj.getPhone_No());
		}
	}
	private static void marshallingExample() throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(employees, System.out);
		jaxbMarshaller.marshal(employees, new File("D://joon//employees.xml"));
		
	}
}
