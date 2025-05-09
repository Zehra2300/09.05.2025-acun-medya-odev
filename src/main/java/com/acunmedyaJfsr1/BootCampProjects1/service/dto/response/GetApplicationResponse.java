package com.acunmedyaJfsr1.BootCampProjects1.service.dto.response;

import com.acunmedyaJfsr1.BootCampProjects1.entity.ApplicationState;

public class GetApplicationResponse {
    private int id;
    private int applicantId;
    private int bootcampId;
    private ApplicationState applicationState;

    public GetApplicationResponse() {
    }

    public GetApplicationResponse(int id, int applicantId, int bootcampId, ApplicationState applicationState) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = applicationState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
