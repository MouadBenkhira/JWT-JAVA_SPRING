package com.example.testingjavaknowledge.service;

import com.example.testingjavaknowledge.Dto.mapper.EmployeeMapper;
import com.example.testingjavaknowledge.Dto.request.SingleEmployeeRequest;
import com.example.testingjavaknowledge.Dto.response.EmployeeResponse;
import com.example.testingjavaknowledge.repo.EmployeeRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public java.util.List<EmployeeResponse> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(EmployeeMapper::toEmployeeResponse)
                .toList();
    }
    
    public EmployeeResponse getEmployeeById(SingleEmployeeRequest request) {
        val employee = employeeRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        return EmployeeMapper.toEmployeeResponse(employee);
    }
}
