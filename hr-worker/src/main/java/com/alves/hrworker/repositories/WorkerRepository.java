package com.alves.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alves.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
