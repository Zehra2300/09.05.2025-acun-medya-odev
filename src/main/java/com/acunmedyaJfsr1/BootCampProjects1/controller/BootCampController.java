package com.acunmedyaJfsr1.BootCampProjects1.controller;

import com.acunmedyaJfsr1.BootCampProjects1.service.BootCampService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBootCampRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBootCampResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBootCampResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bootcamps")
public class BootCampController {

    private final BootCampService service;

    @Autowired
    public BootCampController(BootCampService service) {
        this.service = service;
    }

    @PostMapping
    public GetBootCampResponse add(@RequestBody CreateBootCampRequest request) {
        return service.add(request);
    }

    @PutMapping
    public GetBootCampResponse update(@RequestBody UpdateBootCampRequest request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public GetBootCampResponse getById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<GetAllBootCampResponse> getAll() {
        return service.getAll();
    }
}
