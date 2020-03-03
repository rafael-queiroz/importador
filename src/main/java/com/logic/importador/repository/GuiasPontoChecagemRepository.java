package com.logic.importador.repository;

import com.logic.importador.domain.GuiasPonto;
import com.logic.importador.domain.GuiasPontoChecagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiasPontoChecagemRepository extends CrudRepository<GuiasPontoChecagem, Long> {
}
