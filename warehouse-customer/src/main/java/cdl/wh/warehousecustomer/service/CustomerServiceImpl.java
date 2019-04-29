package cdl.wh.warehousecustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdl.wh.warehousecustomer.modal.Customer;
import cdl.wh.warehousecustomer.proxy.ProductProxy;
import cdl.wh.warehousecustomer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductProxy productProxy;

	@Override
	public List<Customer> getAllCustomer() {
		
		//List<Product> list = productProxy.getAllProduct();
		
		//System.out.println("list --> "+ list);
		
		return customerRepository.findAll();
		
	}

	@Override
	public Customer getCustomer(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerRepository.saveAndFlush(customer);
	}
	
	

}
