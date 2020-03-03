package com.logic.importador.repository;

import com.logic.importador.domain.Guias;
import com.logic.importador.domain.GuiasMov;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasMovRepository extends CrudRepository<GuiasMov, Long> {
}
