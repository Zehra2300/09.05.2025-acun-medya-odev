package com.acunmedyaJfsr1.BootCampProjects1.service;

import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBlacklistResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBlacklistResponse;

import java.util.List;

public interface BlacklistService {
    GetBlacklistResponse add(CreateBlacklistRequest request);
    GetBlacklistResponse update(UpdateBlacklistRequest request);
    void delete(int id);
    GetBlacklistResponse getById(int id);
    List<GetAllBlacklistResponse> getAll();
}

