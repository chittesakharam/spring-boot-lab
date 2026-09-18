package com.nt.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nt.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    // Base URL for the target API
    private static final String BASE_URL = "http://localhost:4040/employee-rest-api/employees";
    
    private final RestTemplate template;

    public EmployeeController(RestTemplate template) {
        this.template = template;
    }

    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
        HttpEntity<Employee> requestEntity = new HttpEntity<>(emp);
        
        ResponseEntity<String> response = template.exchange(
                BASE_URL, 
                HttpMethod.POST, 
                requestEntity, 
                String.class
        );
        
        return new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }
    
    @GetMapping
    public ResponseEntity<List<Employee>> viewAllEmployee() {
        ResponseEntity<List<Employee>> response = template.exchange(
                BASE_URL, 
                HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<List<Employee>>() {}
        );
        
        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        String url = BASE_URL + "/" + id;
        
        ResponseEntity<Employee> response = template.exchange(
                url, 
                HttpMethod.GET, 
                null, 
                Employee.class
        );
        
        return response;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
        String url = BASE_URL + "/" + id;
        HttpEntity<Employee> requestEntity = new HttpEntity<>(emp);
        
        ResponseEntity<String> response = template.exchange(
                url, 
                HttpMethod.PUT, 
                requestEntity, 
                String.class
        );
        
        return new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        String url = BASE_URL + "/" + id;
        
        ResponseEntity<String> response = template.exchange(
                url, 
                HttpMethod.DELETE, 
                null, 
                String.class
        );
        
        return new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }
}