package com.acunmedyaJfsr1.BootCampProjects1.service.dto.request;

import com.acunmedyaJfsr1.BootCampProjects1.entity.ApplicationState;

public class CreateApplicationRequest {
    private int applicantId;
    private int bootcampId;
    private ApplicationState applicationState;

    public CreateApplicationRequest() {
    }

    public CreateApplicationRequest(int applicantId, int bootcampId, ApplicationState applicationState) {
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = applicationState;
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

