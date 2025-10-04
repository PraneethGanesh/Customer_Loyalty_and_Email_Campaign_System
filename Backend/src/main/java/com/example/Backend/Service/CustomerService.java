package com.example.Backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Customer.Customer;
import com.example.Backend.Repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    // Create or Update Customer
    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    // Get all Customers
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    // Get by ID
    public Optional<Customer> getCustomerById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }

    // Find by cEmail (matches your entity and repository)
    public Customer getCustomerByEmail(String cEmail) {
        return repository.findByCEmail(cEmail).orElse(null);
    }
}
