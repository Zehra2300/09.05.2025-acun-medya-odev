package com.acunmedyaJfsr1.BootCampProjects1.service;

import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBootCampResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBootCampResponse;

import java.util.List;

public interface BootCampService {
    GetBootCampResponse add(CreateBootCampRequest request);
    GetBootCampResponse update(UpdateBootCampRequest request);
    void delete(int id);
    GetBootCampResponse getById(int id);
    List<GetAllBootCampResponse> getAll();
}

