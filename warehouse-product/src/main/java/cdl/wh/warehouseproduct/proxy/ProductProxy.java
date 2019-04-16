package cdl.wh.warehouseproduct.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cdl.wh.warehouseproduct.modal.Product;


@FeignClient(name="Product-Service")
public interface ProductProxy {

	
	@GetMapping("/product/")
	public List<Product> getAllProduct();
}
