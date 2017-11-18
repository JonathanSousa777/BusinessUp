package com.bunisessup.controller;

import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.repository.ObjetivosTi;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaObjetivoTiBean implements Serializable {

    @Inject
    private ObjetivosTi objetivosTi;

    private ObjetivoTi objetivoTi;
    private List<ObjetivoTi> listObjetivosTi;

    public PesquisaObjetivoTiBean() {
        listObjetivosTi = new ArrayList<>();
        objetivoTi = new ObjetivoTi();
    }

    public void inicializar() {
        this.listObjetivosTi = objetivosTi.todos();
    }

    public ObjetivoTi getObjetivoTi() {
        return objetivoTi;
    }

    public void excluir() {
        objetivosTi.remover(objetivoTi);
        listObjetivosTi.remove(objetivoTi);

        FacesUtil.addMessage("Objetivo de Ti excluído com sucesso!");
    }

    public void setObjetivoTi(ObjetivoTi objetivoTi) {
        this.objetivoTi = objetivoTi;
    }

    public List<ObjetivoTi> getListObjetivosTi() {
        return listObjetivosTi;
    }

    public void setListObjetivosTi(List<ObjetivoTi> listObjetivosTi) {
        this.listObjetivosTi = listObjetivosTi;
    }
}
