package com.acunmedyaJfsr1.BootCampProjects1.service.dto.request;

import com.acunmedyaJfsr1.BootCampProjects1.entity.BootcampState;
import java.time.LocalDate;

public class CreateBootCampRequest {

    private String name;
    private int instructorId;
    private LocalDate startDate;
    private LocalDate endDate;
    private BootcampState bootcampState;

    public CreateBootCampRequest() {
    }

    public CreateBootCampRequest(String name, int instructorId, LocalDate startDate, LocalDate endDate, BootcampState bootcampState) {
        this.name = name;
        this.instructorId = instructorId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bootcampState = bootcampState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BootcampState getBootcampState() {
        return bootcampState;
    }

    public void setBootcampState(BootcampState bootcampState) {
        this.bootcampState = bootcampState;
    }
}
