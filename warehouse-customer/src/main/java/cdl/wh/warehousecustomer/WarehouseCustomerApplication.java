package cdl.wh.warehousecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WarehouseCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseCustomerApplication.class, args);
	}
	
	


}
