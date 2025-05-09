package com.acunmedyaJfsr1.BootCampProjects1.service.mappers;

import com.acunmedyaJfsr1.BootCampProjects1.entity.ApplicationEntity;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetApplicationResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {

    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", source = "applicationState")
    ApplicationEntity createApplicationRequestToApplication(CreateApplicationRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", source = "applicationState")
    GetApplicationResponse applicationToGetApplicationResponse(ApplicationEntity application);

    List<GetAllApplicationResponse> applicationListToGetAllApplicationResponseList(List<ApplicationEntity> applications);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", source = "applicationState")
    ApplicationEntity updateApplicationRequestToApplication(UpdateApplicationRequest request);
}


