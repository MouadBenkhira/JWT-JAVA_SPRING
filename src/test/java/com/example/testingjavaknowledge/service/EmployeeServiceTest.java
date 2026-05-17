package com.example.testingjavaknowledge.service;

import com.example.testingjavaknowledge.Dto.mapper.EmployeeMapper;
import com.example.testingjavaknowledge.Dto.request.SingleEmployeeRequest;
import com.example.testingjavaknowledge.Dto.response.EmployeeResponse;
import com.example.testingjavaknowledge.model.Employee;
import com.example.testingjavaknowledge.repo.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    private UUID employeeId;
    private Employee employee;

    @BeforeEach
    void setUp() {
        employeeId = UUID.randomUUID();
        employee = new Employee();
        employee.setId(employeeId);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmail("john.doe@example.com");
    }

    @Test
    void getEmployeeById_ShouldReturnResponse_WhenEmployeeExists() {
        SingleEmployeeRequest request = new SingleEmployeeRequest();
        request.setId(employeeId);

        when(employeeRepository.findById(employeeId)).thenReturn(Optional.of(employee));

        EmployeeResponse response = employeeService.getEmployeeById(request);

        assertNotNull(response);
        assertEquals(employee.getFirstName(), response.getFirstName());
        assertEquals(employee.getLastName(), response.getLastName());
        verify(employeeRepository).findById(employeeId);
    }

    @Test
    void getEmployeeById_ShouldThrowException_WhenEmployeeDoesNotExist() {
        SingleEmployeeRequest request = new SingleEmployeeRequest();
        request.setId(employeeId);

        when(employeeRepository.findById(employeeId)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> employeeService.getEmployeeById(request));
        verify(employeeRepository).findById(employeeId);
    }
}
