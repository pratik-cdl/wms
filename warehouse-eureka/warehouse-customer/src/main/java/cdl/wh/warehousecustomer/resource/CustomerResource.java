package cdl.wh.warehousecustomer.resource;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdl.wh.warehousecustomer.modal.Customer;
import cdl.wh.warehousecustomer.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerResource {

	private static Logger log = LoggerFactory.getLogger(CustomerResource.class);
	
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/")
	public ResponseEntity<?> getAllCustomers(@RequestHeader("Authorization") String token){
	
		log.info("getAllCustomers ----------------->");
		
		List<Customer> result = customerService.getAllCustomer(token);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/secure")
	public ResponseEntity<?> demo(Principal p){
	
		System.out.println("principal :: "+p);
		return new ResponseEntity<>("helloWorld",HttpStatus.OK);
	}
}
