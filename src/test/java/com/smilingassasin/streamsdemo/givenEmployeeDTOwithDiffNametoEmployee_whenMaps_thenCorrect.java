package com.smilingassasin.streamsdemo;

import basecode.EmployeeMapper;
import basecode.MapStructEmployee;
import basecode.MapStructEmployeeDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect {
    EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);
    @Test
    public void givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect() {
        MapStructEmployeeDTO dto = new MapStructEmployeeDTO();
        dto.setEmployeeId(1);
        dto.setEmployeeName("John");


        MapStructEmployee entity = mapper.employeeDTOtoEmployee(dto);

        assertEquals(dto.getEmployeeId(), entity.getId());
        assertEquals(dto.getEmployeeName(), entity.getName());
    }
}
