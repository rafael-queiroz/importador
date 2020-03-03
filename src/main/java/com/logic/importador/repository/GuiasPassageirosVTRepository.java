package com.logic.importador.repository;

import com.logic.importador.domain.GuiasPassageiros;
import com.logic.importador.domain.GuiasPassageirosVT;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasPassageirosVTRepository extends CrudRepository<GuiasPassageirosVT, Long> {
}
