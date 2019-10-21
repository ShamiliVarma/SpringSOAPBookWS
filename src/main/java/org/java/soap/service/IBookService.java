package org.java.soap.service;

import javax.jws.WebService;


@WebService(name="IBookService")
public interface IBookService {

	public String getBookDetails(String bookNum);
}
