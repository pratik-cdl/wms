package cdl.wh.warehousecustomer.resource;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdl.wh.warehousecustomer.modal.Customer;
import cdl.wh.warehousecustomer.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerResource {

	private static Logger log = LoggerFactory.getLogger(CustomerResource.class);
	
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/all")
	@PreAuthorize("hasRole('ROLE_WMS_USER')")
	public ResponseEntity<?> getAllCustomer(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(">>" + auth.getAuthorities());
	
		List<Customer> result = customerService.getAllCustomer();
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_WMS_USER')")
	public ResponseEntity<?> getAllCustomerDetails(@PathVariable("id") Long id){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(">>" + auth.getAuthorities());
	
		Customer result = customerService.getCustomer(id);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/helloWorld")
	public ResponseEntity<?> demo(Principal p){
	
		System.out.println("principal :: "+p);
		return new ResponseEntity<>("helloWorld",HttpStatus.OK);
	}
}
