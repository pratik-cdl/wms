package cdl.wh.warehouseproduct.service;

import java.util.List;

import cdl.wh.warehouseproduct.modal.Product;



public interface ProductService {

	List<Product> getAllProduct();
	
	Product getProduct(Long customerid);
	
}
