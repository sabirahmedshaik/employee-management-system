package net.springboot.ems.service.impl;

import lombok.AllArgsConstructor;
import net.springboot.ems.dto.EmployeeDto;
import net.springboot.ems.entity.Employee;
import net.springboot.ems.mapper.EmployeeMapper;
import net.springboot.ems.repository.EmployeeRepository;
import net.springboot.ems.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

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

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceAccessException(("Employee is not exists with given id : " + employeeId)));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
