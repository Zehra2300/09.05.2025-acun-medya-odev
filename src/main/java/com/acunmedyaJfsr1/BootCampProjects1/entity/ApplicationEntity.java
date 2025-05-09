package com.acunmedyaJfsr1.BootCampProjects1.entity;

import jakarta.persistence.*;

@Entity
public class ApplicationEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private int applicantId;

        private int bootcampId;

        @Enumerated(EnumType.STRING)
        private ApplicationState applicationState;

        public ApplicationEntity() {
        }

        public ApplicationEntity(int id, int applicantId, int bootcampId, ApplicationState applicationState) {
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






