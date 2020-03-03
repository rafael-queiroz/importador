package com.logic.importador.repository;

import com.logic.importador.domain.Guias;
import com.logic.importador.domain.GuiasPegadaLargada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasPegadaLargadaRepository extends CrudRepository<GuiasPegadaLargada, Long> {
}
