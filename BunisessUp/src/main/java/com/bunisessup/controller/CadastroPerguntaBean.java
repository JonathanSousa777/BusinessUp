package com.bunisessup.controller;

import com.bunisessup.model.Pergunta;
import com.bunisessup.repository.Perguntas;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroPerguntaBean implements Serializable {

    @Inject
    private Pergunta pergunta;

    @Inject
    private Perguntas perguntas;

    public CadastroPerguntaBean() {
        this.pergunta = new Pergunta();
    }

    public void salvar() {
        this.pergunta = perguntas.salvar(this.pergunta);
        this.pergunta = new Pergunta();

        FacesUtil.addMessage("Pergunta salva com sucesso");
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
}
