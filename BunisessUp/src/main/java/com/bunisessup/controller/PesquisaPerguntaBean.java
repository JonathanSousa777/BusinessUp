package com.bunisessup.controller;

import com.bunisessup.model.Pergunta;
import com.bunisessup.repository.Perguntas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaPerguntaBean implements Serializable {

    @Inject
    private Perguntas perguntas;

    private List<Pergunta> listaPergunta;

    public PesquisaPerguntaBean() {
        listaPergunta = new ArrayList<>();
    }

    public void inicializar() {
        listaPergunta = perguntas.todas();
    }

    public List<Pergunta> getListaPergunta() {
        return listaPergunta;
    }

    public void setListaPergunta(List<Pergunta> listaPergunta) {
        this.listaPergunta = listaPergunta;
    }

}
