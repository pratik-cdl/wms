package cdlwh.warehouseeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WarehouseEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseEurekaApplication.class, args);
	}

}
