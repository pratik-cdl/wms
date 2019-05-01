package cdl.wh.warehouseproduct.service;

import java.util.List;

import cdl.wh.warehouseproduct.modal.Product;


public interface ProductService {

	List<Product> getAllProduct(Long customerId);
	
	Product getProduct(Long productId);
	
	Product updateProduct(Product product);

	Product addNewProduct(Product product);
	
	void deleteProduct(Long productId);
	
}
