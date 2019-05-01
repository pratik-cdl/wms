package cdl.wh.warehouseproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdl.wh.warehouseproduct.modal.Product;
import cdl.wh.warehouseproduct.repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepository productRepository;
	


	@Override
	public List<Product> getAllProduct(Long customerId) {
		
		//List<Product> list = productProxy.getAllProduct();
		
		//System.out.println("list --> "+ list);
		
		return productRepository.findByCustomerId(customerId);
		
	}

	@Override
	public Product getProduct(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).get();
	}

	@Override
	public Product updateProduct(Product product) {
		
		return productRepository.saveAndFlush(product);
	}
	
	@Override
	public Product addNewProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	public void deleteProduct(Long productId) {
		
		productRepository.deleteById(productId);
		
	}
	

}
