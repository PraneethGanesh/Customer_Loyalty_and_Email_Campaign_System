package com.example.Backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Customer.Customer;

@Repository
public interface AdminRepository extends JpaRepository<Customer, Integer> {
    Customer findByCEmailAndRole(String cEmail, String role); // e.g. ("admin@email.com", "ADMIN")
    List<Customer> findAllByRole(String role); // e.g. get all admins
}
