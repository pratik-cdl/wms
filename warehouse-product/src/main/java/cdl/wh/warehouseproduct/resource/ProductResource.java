package cdl.wh.warehouseproduct.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	
	@GetMapping("/all/{customerId}")
	@PreAuthorize("hasRole('ROLE_PRODUCT_VIEW')")
	public ResponseEntity<?> getAllProduct(@PathVariable("customerId") Long customerId){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(">>" + auth.getAuthorities());
	
		
		List<Product> result = productService.getAllProduct(customerId);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_PRODUCT_VIEW')")
	public ResponseEntity<?> getProduct(@PathVariable("id") Long id){
		
		Product result = productService.getProduct(id);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	

	
	@PostMapping("/")
	@PreAuthorize("hasRole('ROLE_PRODUCT_CREATE')")
	public ResponseEntity<?> createProduct(@RequestBody Product p){
		System.out.println("createProduct :: "+p);
		p = productService.addNewProduct(p);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_PRODUCT_CREATE')")
	public ResponseEntity<?> updateProduct(@RequestBody Product p){
		System.out.println("updateProduct :: "+p);
		p = productService.updateProduct(p);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_PRODUCT_DELETE')")
	public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id){
		System.out.println("deleteProduct :: "+id);
		productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<?> test(){
		
		return new ResponseEntity<>("{'msg':'PRODUCT test'}",HttpStatus.OK);
	}
}
