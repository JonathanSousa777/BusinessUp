package com.bunisessup.repository;

import com.bunisessup.model.Processo;
import com.bunisessup.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan Sousa
 */
public class Processos implements Serializable {

    @Inject
    private EntityManager manager;

    @Transactional
    public Processo salvar(Processo processo) {
        return manager.merge(processo);
    }
}
