package com.bunisessup.repository;

import com.bunisessup.model.Pergunta;
import com.bunisessup.util.jpa.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

public class Perguntas implements Serializable {

    @Inject
    private EntityManager manager;

    @Transactional
    public Pergunta salvar(Pergunta pergunta) {
        return manager.merge(pergunta);
    }

    public List<Pergunta> todas() {
        return manager.createQuery("from Pergunta", Pergunta.class).getResultList();
    }

    public Pergunta porId(Long id) {
        return manager.find(Pergunta.class, id);
    }
}
