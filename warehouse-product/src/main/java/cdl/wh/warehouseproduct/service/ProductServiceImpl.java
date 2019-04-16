package cdl.wh.warehouseproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdl.wh.warehouseproduct.modal.Product;
import cdl.wh.warehouseproduct.proxy.ProductProxy;
import cdl.wh.warehouseproduct.repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductProxy productProxy;

	@Override
	public List<Product> getAllProduct() {
		
		//List<Product> list = productProxy.getAllProduct();
		
		//System.out.println("list --> "+ list);
		
		return productRepository.findAll();
		
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

}
