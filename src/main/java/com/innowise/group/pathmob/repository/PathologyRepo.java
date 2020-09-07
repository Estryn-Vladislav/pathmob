package com.innowise.group.pathmob.repository;

import com.innowise.group.pathmob.model.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PathologyRepo extends JpaRepository<Pathology, Long> {

    List<Pathology> findAllByTypeId(Long typeId);

}
