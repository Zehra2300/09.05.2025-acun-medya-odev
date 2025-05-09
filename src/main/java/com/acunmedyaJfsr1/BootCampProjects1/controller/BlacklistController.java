package com.acunmedyaJfsr1.BootCampProjects1.controller;

import com.acunmedyaJfsr1.BootCampProjects1.service.BlacklistService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBlacklistResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBlacklistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blacklists")
public class BlacklistController {

    private final BlacklistService service;

    @Autowired
    public BlacklistController(BlacklistService service) {
        this.service = service;
    }

    @PostMapping
    public GetBlacklistResponse add(@RequestBody CreateBlacklistRequest request) {
        return service.add(request);
    }

    @PutMapping
    public GetBlacklistResponse update(@RequestBody UpdateBlacklistRequest request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public GetBlacklistResponse getById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<GetAllBlacklistResponse> getAll() {
        return service.getAll();
    }
}
