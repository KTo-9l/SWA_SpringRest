package org.sillysociety.service;

import org.sillysociety.models.Brigade;

import java.util.List;

public interface BrigadeService {
    Brigade addBrigade(Brigade client);
    void delete(Brigade client);
    Brigade getById(Integer id);
    List<Brigade> getAllBrigades();
    Brigade updateBrigade(Brigade client);
}
