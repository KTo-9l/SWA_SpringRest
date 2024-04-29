package org.sillysociety.service.impl;

import org.sillysociety.models.Brigade;
import org.sillysociety.repository.BrigadeRepository;
import org.sillysociety.service.BrigadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrigadeServiceImpl implements BrigadeService {
    @Autowired
    private BrigadeRepository brigadeRepository;

    @Override
    public Brigade addBrigade(Brigade client) {
        return brigadeRepository.save(client);
    }

    @Override
    public void delete(Brigade client) {
        brigadeRepository.delete(client);
    }

    @Override
    public Brigade getById(Integer id) {
        return brigadeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Brigade> getAllBrigades() {
        return (List<Brigade>) brigadeRepository.findAll();
    }

    @Override
    public Brigade updateBrigade(Brigade client) {
        return brigadeRepository.save(client);
    }
}
