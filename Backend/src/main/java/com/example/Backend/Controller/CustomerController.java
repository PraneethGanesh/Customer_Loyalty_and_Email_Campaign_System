package com.example.Backend.Controller;

import com.example.Backend.Customer.Customer;
import com.example.Backend.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Endpoint to get own profile by email (customer must provide email or get from auth principal)
    @GetMapping("/profile/{email}")
    public Customer getCustomerProfile(@PathVariable String email) {
        return customerService.getCustomerByEmail(email);
    }
}
