package com.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class );

    @Mappings({
            @Mapping(target="employeeId", source="id"),
            @Mapping(target="employeeName", source="name")
    })
    EmployeeDto employeeToEmployeeDTO(Employee entity);

    @Mappings({
            @Mapping(target="id", source="employeeId"),
            @Mapping(target="name", source="employeeName")
    })
    Employee employeeDTOtoEmployee(EmployeeDto dto);
}
