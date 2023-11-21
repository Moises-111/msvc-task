package com.mois.msvctask.repositories;

import com.mois.msvctask.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
