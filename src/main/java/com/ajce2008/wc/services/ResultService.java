package com.ajce2008.wc.services;

import com.ajce2008.wc.models.Result;
import com.ajce2008.wc.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return (List<Result>) resultRepository.findAll();
    }
}
