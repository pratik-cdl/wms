package cdl.wh.warehouseproduct.resource;

import java.security.Principal;
import java.util.List;

import org.keycloak.KeycloakSecurityContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cdl.wh.warehouseproduct.modal.Product;
import cdl.wh.warehouseproduct.service.ProductService;



@RestController
@RequestMapping("product")
public class ProductResource {

	private static Logger log = LoggerFactory.getLogger(ProductResource.class);
	
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllProduct(){
		
		List<Product> result = productService.getAllProduct();
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAllProductDetails(@PathVariable("id") Long id){
		
		Product result = productService.getProduct(id);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createProduct(@RequestBody Product p){
		p.setName("createProduct");
		System.out.println("principal :: "+p);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<?> updateProduct(@RequestBody Product p){
		p.setName("updateProduct");
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
}
