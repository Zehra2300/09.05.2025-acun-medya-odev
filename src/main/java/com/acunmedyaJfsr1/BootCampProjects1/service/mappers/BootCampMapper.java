package com.acunmedyaJfsr1.BootCampProjects1.service.mappers;

import com.acunmedyaJfsr1.BootCampProjects1.entity.BootCampEntity;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBootCampResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBootCampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface BootCampMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", source = "bootcampState")
    BootCampEntity createBootCampRequestToBootCamp(CreateBootCampRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", source = "bootcampState")
    BootCampEntity updateBootCampRequestToBootCamp(UpdateBootCampRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", source = "bootcampState")
    GetBootCampResponse bootCampToGetBootCampResponse(BootCampEntity entity);

    List<GetAllBootCampResponse> bootCampListToGetAllBootCampResponseList(List<BootCampEntity> entities);
}
