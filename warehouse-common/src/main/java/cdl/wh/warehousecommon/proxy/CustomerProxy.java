package cdl.wh.warehousecommon.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cdl.wh.warehousecommon.dto.CustomerDTO;



@FeignClient(name = "product-service")
public interface CustomerProxy {

	
	@GetMapping("/customer/{customerId}")
    CustomerDTO getCustomer(@PathVariable("customerId") Long customerId);
}
