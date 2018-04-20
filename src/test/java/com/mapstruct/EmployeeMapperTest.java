package com.mapstruct;

import com.mapstruct.example.Employee;
import com.mapstruct.example.EmployeeDto;
import com.mapstruct.example.EmployeeMapper;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EmployeeMapperTest {

    @Test
    public void testHappyPathEmployeeToEmployeeDto() {
        //given
        Employee employee = new Employee( 1, "Juan Perez" );

        //when
        EmployeeDto employeeDto = EmployeeMapper.INSTANCE.employeeToEmployeeDTO( employee );

        //then
        assertNotNull( employeeDto );
        assertThat( "Employee ID",employeeDto.getEmployeeId(),is(1));
        assertThat( "Employee Name ",employeeDto.getEmployeeName(), is( "Juan Perez" ));
    }

    @Test
    public void testHappyPathEmployeeDtoToEmployee() {
        //given
        EmployeeDto employeeDto = new EmployeeDto( 2, "Magico Gonzales" );

        //when
        Employee employee = EmployeeMapper.INSTANCE.employeeDTOtoEmployee( employeeDto );

        //then
        assertNotNull( employeeDto );
        assertThat( "Employee ID",employee.getId(),is(2));
        assertThat( "Employee Name ",employee.getName(), is( "Magico Gonzales" ));
    }
}
