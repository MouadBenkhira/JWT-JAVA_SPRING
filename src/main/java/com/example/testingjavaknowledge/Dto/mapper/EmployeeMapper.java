package com.example.testingjavaknowledge.Dto.mapper;

import com.example.testingjavaknowledge.Dto.response.EmployeeResponse;
import com.example.testingjavaknowledge.model.Employee;
import lombok.Data;

@Data
public  class EmployeeMapper {

    public static EmployeeResponse toEmployeeResponse(Employee employee) {

        return new EmployeeResponse(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getAddress()
        );

    }
}
