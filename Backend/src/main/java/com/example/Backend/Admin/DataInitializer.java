package com.example.Backend.Admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.Backend.Customer.Customer;
import com.example.Backend.Repository.AdminRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder encoder;

    public DataInitializer(AdminRepository repo, BCryptPasswordEncoder passwordEncoder) {
        this.adminRepository = repo;
        this.encoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (adminRepository.findByCEmailAndRole("admin@email.com", "ADMIN") == null) {
            Customer admin = new Customer();
            admin.setcEmail("admin@email.com");
            admin.setC_password(encoder.encode("admin123"));
            admin.setRole("ADMIN");
            admin.setC_name("Admin");
            // Add other required fields if any
            adminRepository.save(admin);
        }
    }
}
