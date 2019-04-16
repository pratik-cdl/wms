package cdl.wh.warehouseproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdl.wh.warehouseproduct.modal.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
