package org.sillysociety.repository;

import org.sillysociety.models.Experiment;
import org.springframework.data.repository.CrudRepository;

public interface ExperimentRepository extends CrudRepository<Experiment, Integer> {
}
