package com.logic.importador.repository;

import com.logic.importador.domain.Guias;
import com.logic.importador.domain.GuiasPassageiros;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasPassageirosRepository extends CrudRepository<GuiasPassageiros, Long> {
}
