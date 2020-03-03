package com.logic.importador.repository;

import com.logic.importador.domain.GuiasPassageiros;
import com.logic.importador.domain.GuiasPassageiros100;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasPassageiros100Repository extends CrudRepository<GuiasPassageiros100, Long> {
}
