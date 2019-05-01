package cdl.wh.warehousecommon.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cdl.wh.warehousecommon.dto.ProductDTO;

@FeignClient(name = "product-service")
public interface ProductProxy {
	
	
	@GetMapping("/products/{productId}")
    ProductDTO getProduct(@PathVariable("productId") Long productId);

}
