package cdl.wh.warehouseproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WarehouseProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseProductApplication.class, args);
	}

}
