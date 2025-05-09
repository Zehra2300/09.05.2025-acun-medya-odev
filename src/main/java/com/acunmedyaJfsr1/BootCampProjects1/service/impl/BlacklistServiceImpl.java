package com.acunmedyaJfsr1.BootCampProjects1.service.impl;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Blacklist;
import com.acunmedyaJfsr1.BootCampProjects1.repository.BlacklistRepository;
import com.acunmedyaJfsr1.BootCampProjects1.service.BlacklistService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBlacklistResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBlacklistResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.mappers.BlacklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlacklistServiceImpl implements BlacklistService {

    private final BlacklistRepository repository;
    private final BlacklistMapper mapper;

    @Autowired
    public BlacklistServiceImpl(BlacklistRepository repository, BlacklistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public GetBlacklistResponse add(CreateBlacklistRequest request) {
        Blacklist entity = mapper.createBlacklistRequestToBlacklist(request);
        Blacklist saved = repository.save(entity);
        return mapper.blacklistToGetBlacklistResponse(saved);
    }

    @Override
    public GetBlacklistResponse update(UpdateBlacklistRequest request) {
        Blacklist entity = mapper.updateBlacklistRequestToBlacklist(request);
        Blacklist updated = repository.save(entity);
        return mapper.blacklistToGetBlacklistResponse(updated);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public GetBlacklistResponse getById(int id) {
        Optional<Blacklist> entity = repository.findById(id);
        return entity.map(mapper::blacklistToGetBlacklistResponse).orElse(null);
    }

    @Override
    public List<GetAllBlacklistResponse> getAll() {
        return mapper.blacklistListToGetAllBlacklistResponseList(repository.findAll());
    }
}
