package cdl.wh.warehousecustomer.service;

import java.util.List;

import cdl.wh.warehousecustomer.modal.Customer;

public interface CustomerService {

	List<Customer> getAllCustomer(String token);
	
	Customer getCustomer(Long customerid);
	
	Customer updateCustomer(Customer customer);
	
	Customer addNewCustomer(Customer customer);
	
	void deleteCustomer(Long customerId);
	
}
