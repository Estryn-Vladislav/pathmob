package com.innowise.group.pathmob.repository;

import com.innowise.group.pathmob.model.PathologyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologyTypeRepo extends JpaRepository<PathologyType, Long> {
}
