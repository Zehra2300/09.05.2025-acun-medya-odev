package com.acunmedyaJfsr1.BootCampProjects1.repository;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BlacklistRepository extends JpaRepository<Blacklist, Integer> {
    List<Blacklist> findByApplicantId(int applicantId);
}



