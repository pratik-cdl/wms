package cdl.wh.warehousecommon.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import cdl.wh.warehousecommon.dto.ProductDTO;

@FeignClient(name = "product-service")
public interface ProductProxy {
	
	
	@GetMapping("/product/{productId}")
    ProductDTO getProduct(@RequestHeader("Authorization") String authorization,@PathVariable("productId") Long productId);

}
