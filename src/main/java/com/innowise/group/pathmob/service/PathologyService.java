package com.innowise.group.pathmob.service;

import com.innowise.group.pathmob.model.Pathology;
import com.innowise.group.pathmob.repository.PathologyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PathologyService {

    @Autowired
    private PathologyRepo repo;

    public List<Pathology> getAllByType(String type) {
        return repo.findAllByTypeId(Long.valueOf(type));
    }

    public void add(List<Pathology> pathologies) {
        repo.saveAll(pathologies);
    }
}