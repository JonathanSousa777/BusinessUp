package com.bunisessup.repository;

import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.util.jpa.Transactional;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

public class ObjetivosTi implements Serializable {

    @Inject
    private EntityManager manager;

    public List<ObjetivoTi> todos() {
        return manager.createQuery("from ObjetivoTi").getResultList();
    }

    public ObjetivoTi porId(long id) {
        return manager.find(ObjetivoTi.class, id);
    }

    public ObjetivoTi guardar(ObjetivoTi objetivoTi) {
        return manager.merge(objetivoTi);
    }

    @Transactional
    public void remover(ObjetivoTi objetivoTi) {
        try {
            objetivoTi = manager.find(ObjetivoTi.class, objetivoTi.getId());
            System.out.println("passou pesquisar");
            manager.remove(objetivoTi);
            System.out.println("passou remove");
            manager.flush();
        } catch (PersistenceException ex) {
            FacesUtil.addErrorMessage("Objetivo de Ti não pode ser excluído");
        }
    }
}
