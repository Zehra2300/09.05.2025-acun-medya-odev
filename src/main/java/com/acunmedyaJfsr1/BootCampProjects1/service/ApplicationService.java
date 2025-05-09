package com.acunmedyaJfsr1.BootCampProjects1.service;

import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetApplicationResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllApplicationResponse;

import java.util.List;

public interface ApplicationService {

    GetApplicationResponse add(CreateApplicationRequest request);

    GetApplicationResponse update(UpdateApplicationRequest request);

    void delete(int id);

    GetApplicationResponse getById(int id);

    List<GetAllApplicationResponse> getAll();
}

