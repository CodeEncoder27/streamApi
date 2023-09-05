package basecode;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {

    @Mapping(target="employeeId", source="entity.id")
    @Mapping(target="employeeName", source="entity.name")
    MapStructEmployeeDTO employeeToEmployeeDTO(MapStructEmployee entity);

    @Mapping(target="id", source="dto.employeeId")
    @Mapping(target="name", source="dto.employeeName")
    MapStructEmployee employeeDTOtoEmployee(MapStructEmployeeDTO dto);
}
