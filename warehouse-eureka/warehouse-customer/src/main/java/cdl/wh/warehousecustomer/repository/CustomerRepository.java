package cdl.wh.warehousecustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdl.wh.warehousecustomer.modal.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
