package com.logic.importador.repository;

import com.logic.importador.domain.Guias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sun.font.ScriptRunData;

@Repository
public interface GuiasRepository extends CrudRepository<Guias, Long> {
}
