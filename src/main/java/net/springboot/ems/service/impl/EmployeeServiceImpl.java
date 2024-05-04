package net.springboot.ems.service.impl;

import lombok.AllArgsConstructor;
import net.springboot.ems.dto.EmployeeDto;
import net.springboot.ems.entity.Employee;
import net.springboot.ems.mapper.EmployeeMapper;
import net.springboot.ems.repository.EmployeeRepository;
import net.springboot.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savesEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
