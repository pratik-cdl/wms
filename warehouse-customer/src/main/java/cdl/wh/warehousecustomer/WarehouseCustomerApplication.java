package cdl.wh.warehousecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableFeignClients
public class WarehouseCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseCustomerApplication.class, args);
	}
	
	
//    @Bean
//	public CorsFilter corsFilter() {
//	  final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	  final CorsConfiguration config = new CorsConfiguration();
//	  config.setAllowCredentials(true);
//	  config.addAllowedOrigin("*");
//	  config.addExposedHeader("Content-Type");
//	  config.addExposedHeader("Authorization");
//	  config.addExposedHeader("Accept");
//	  config.addExposedHeader("Access-Control-Request-Headers");
//	  config.addExposedHeader("Access-Control-Request-Method");
//	  config.addExposedHeader("X-Requested-With");
//	  config.addExposedHeader("Origin");
//	  config.addExposedHeader("X-Xsrf-Token");
//	  config.addAllowedHeader("*");
//	  config.addAllowedMethod("*");
//	  source.registerCorsConfiguration("/**", config);
//	  return new CorsFilter(source);
//	} 

}
