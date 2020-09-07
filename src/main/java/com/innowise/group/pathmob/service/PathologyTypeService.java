package com.innowise.group.pathmob.service;

import com.innowise.group.pathmob.model.PathologyType;
import com.innowise.group.pathmob.repository.PathologyTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PathologyTypeService {

    @Autowired
    private PathologyTypeRepo repo;

    public List<PathologyType> getAll(){
        return repo.findAll();
    }

}
