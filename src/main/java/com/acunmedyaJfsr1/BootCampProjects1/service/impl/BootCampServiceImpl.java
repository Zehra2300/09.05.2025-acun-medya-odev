package com.acunmedyaJfsr1.BootCampProjects1.service.impl;

import com.acunmedyaJfsr1.BootCampProjects1.entity.BootCampEntity;
import com.acunmedyaJfsr1.BootCampProjects1.repository.BootCampRepository;
import com.acunmedyaJfsr1.BootCampProjects1.service.BootCampService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBootCampResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBootCampResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.mappers.BootCampMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BootCampServiceImpl implements BootCampService {

    private final BootCampRepository repository;
    private final BootCampMapper mapper;

    @Autowired
    public BootCampServiceImpl(BootCampRepository repository, BootCampMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public GetBootCampResponse add(CreateBootCampRequest request) {
        BootCampEntity entity = mapper.createBootCampRequestToBootCamp(request);
        BootCampEntity saved = repository.save(entity);
        return mapper.bootCampToGetBootCampResponse(saved);
    }

    @Override
    public GetBootCampResponse update(UpdateBootCampRequest request) {
        BootCampEntity entity = mapper.updateBootCampRequestToBootCamp(request);
        BootCampEntity updated = repository.save(entity);
        return mapper.bootCampToGetBootCampResponse(updated);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public GetBootCampResponse getById(int id) {
        Optional<BootCampEntity> entity = repository.findById(id);
        return entity.map(mapper::bootCampToGetBootCampResponse).orElse(null);
    }

    @Override
    public List<GetAllBootCampResponse> getAll() {
        List<BootCampEntity> entities = repository.findAll();
        return mapper.bootCampListToGetAllBootCampResponseList(entities);
    }
}
