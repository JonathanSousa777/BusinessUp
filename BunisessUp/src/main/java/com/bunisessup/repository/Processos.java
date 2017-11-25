package com.bunisessup.repository;

import com.bunisessup.model.Processo;
import com.bunisessup.util.jpa.Transactional;
import java.io.Serializable;
import java.util.List;
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
    
    @Transactional
    public void remover(Processo processo) {
        processo = manager.find(Processo.class, processo.getId());
        manager.remove(processo);
        manager.flush();
    }

    public List<Processo> todos() {
        return manager.createQuery("from Processo", Processo.class).getResultList();
    }

    public Processo porId(Long id) {
        return manager.find(Processo.class, id);
    }
}
