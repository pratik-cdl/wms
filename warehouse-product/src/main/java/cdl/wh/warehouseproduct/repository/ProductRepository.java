package cdl.wh.warehouseproduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cdl.wh.warehouseproduct.modal.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByCustomerId(Long customerId);

}
