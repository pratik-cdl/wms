package cdl.wh.warehouseproduct.resource;

import java.security.Principal;
import java.util.List;

import org.keycloak.KeycloakSecurityContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cdl.wh.warehouseproduct.modal.Product;
import cdl.wh.warehouseproduct.service.ProductService;



@RestController

public class ProductResource {

	private static Logger log = LoggerFactory.getLogger(ProductResource.class);
	
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/api/{employee}")
	public ResponseEntity<?> getAllProduct(){
		
		//Authentication auth = KeycloakSecurityContext.getContext().getAuthentication();
		
		//System.out.println(">>" + auth.getAuthorities());
	
		List<Product> result = productService.getAllProduct();
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAllCustomerDetails(@PathVariable("id") Long id){
		
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		//System.out.println(">>" + auth.getAuthorities());
	
		Product result = productService.getProduct(id);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/helloWorld")
	public ResponseEntity<?> demo(Principal p){
	
		System.out.println("principal :: "+p);
		return new ResponseEntity<>("helloWorld",HttpStatus.OK);
	}
}
