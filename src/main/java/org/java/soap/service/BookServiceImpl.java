package org.java.soap.service;
import javax.jws.WebService;
@WebService(serviceName="BookService", endpointInterface="org.java.soap.service.IBookService", portName="BookServicePort")
public class BookServiceImpl implements IBookService{

	public String getBookDetails(String bookNum) {
		System.out.println("In BookServiceImpl :: getBookDetails");
		if(bookNum.equalsIgnoreCase("ISBN-2134")){
            return "Microbiology";
        }
        return "Invalid_ISBN_Number";
     }

}
