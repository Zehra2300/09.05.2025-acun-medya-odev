package com.acunmedyaJfsr1.BootCampProjects1.service.impl;

import com.acunmedyaJfsr1.BootCampProjects1.entity.ApplicationEntity;
import com.acunmedyaJfsr1.BootCampProjects1.repository.ApplicationRepository;
import com.acunmedyaJfsr1.BootCampProjects1.service.ApplicationService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetApplicationResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllApplicationResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.mappers.ApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository repository;
    private final ApplicationMapper mapper;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository repository, ApplicationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public GetApplicationResponse add(CreateApplicationRequest request) {
        ApplicationEntity entity = mapper.createApplicationRequestToApplication(request);
        ApplicationEntity saved = repository.save(entity);
        return mapper.applicationToGetApplicationResponse(saved);
    }

    @Override
    public GetApplicationResponse update(UpdateApplicationRequest request) {
        ApplicationEntity entity = mapper.updateApplicationRequestToApplication(request);
        ApplicationEntity updated = repository.save(entity);
        return mapper.applicationToGetApplicationResponse(updated);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public GetApplicationResponse getById(int id) {
        Optional<ApplicationEntity> entity = repository.findById(id);
        return entity.map(mapper::applicationToGetApplicationResponse).orElse(null);
    }

    @Override
    public List<GetAllApplicationResponse> getAll() {
        List<ApplicationEntity> entities = repository.findAll();
        return mapper.applicationListToGetAllApplicationResponseList(entities);
    }
}

