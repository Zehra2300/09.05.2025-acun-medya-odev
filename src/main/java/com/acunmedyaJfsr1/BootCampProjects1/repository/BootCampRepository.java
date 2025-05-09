package com.acunmedyaJfsr1.BootCampProjects1.repository;

import com.acunmedyaJfsr1.BootCampProjects1.entity.BootCampEntity;
import com.acunmedyaJfsr1.BootCampProjects1.entity.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BootCampRepository extends JpaRepository<BootCampEntity, Integer> {
    List<BootCampEntity> findByBootcampState(BootcampState bootcampState);
}

