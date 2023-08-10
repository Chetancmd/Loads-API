package com.springloadrest.springloadrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springloadrest.springloadrest.entities.Load;

public interface LoadDao extends JpaRepository<Load, Long> {

}
