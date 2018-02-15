package com.boorilaz.repositories;

import com.boorilaz.entity.RemindEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<RemindEntity, Long> {
}
