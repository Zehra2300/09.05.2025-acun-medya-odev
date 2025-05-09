package com.acunmedyaJfsr1.BootCampProjects1.service.dto.response;

import java.time.LocalDate;

public class GetAllBlacklistResponse {
    private int id;
    private String reason;
    private LocalDate date;
    private int applicantId;

    public GetAllBlacklistResponse() {
    }

    public GetAllBlacklistResponse(int id, String reason, LocalDate date, int applicantId) {
        this.id = id;
        this.reason = reason;
        this.date = date;
        this.applicantId = applicantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
