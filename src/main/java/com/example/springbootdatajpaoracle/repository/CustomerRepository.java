package com.example.springbootdatajpaoracle.repository;

import com.example.springbootdatajpaoracle.domain.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RANGA on 3/26/2017.
 */
@Repository
public interface CustomerRepository  extends CrudRepository<Customer,Long>{
    List<Customer> findByLastName(String lastName);
}
