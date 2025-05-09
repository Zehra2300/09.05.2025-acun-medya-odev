package com.acunmedyaJfsr1.BootCampProjects1.service.dto.request;

import java.time.LocalDate;

public class CreateBlacklistRequest {
    private String reason;
    private LocalDate date;
    private int applicantId;

    public CreateBlacklistRequest() {
    }

    public CreateBlacklistRequest(String reason, LocalDate date, int applicantId) {
        this.reason = reason;
        this.date = date;
        this.applicantId = applicantId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
}
