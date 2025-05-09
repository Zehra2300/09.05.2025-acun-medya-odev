package com.acunmedyaJfsr1.BootCampProjects1.controller;

import com.acunmedyaJfsr1.BootCampProjects1.service.ApplicationService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateApplicationRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetApplicationResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllApplicationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService service;

    @Autowired
    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public GetApplicationResponse add(@RequestBody CreateApplicationRequest request) {
        return service.add(request);
    }

    @PutMapping
    public GetApplicationResponse update(@RequestBody UpdateApplicationRequest request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public GetApplicationResponse getById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<GetAllApplicationResponse> getAll() {
        return service.getAll();
    }
}

