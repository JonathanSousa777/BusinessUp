package com.bunisessup.controller;

import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.model.TipoObjetivo;
import com.bunisessup.service.CadastroObjetivoTiService;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroObjetivoTiBean implements Serializable {

    @Inject
    private ObjetivoTi objetivoTi;

    @Inject
    private CadastroObjetivoTiService service;

    public CadastroObjetivoTiBean() {
        limpar();
    }

    public void limpar() {
        this.objetivoTi = new ObjetivoTi();
    }

    public void salvar() {
        this.service.salvar(this.objetivoTi);
        limpar();

        FacesUtil.addMessage("Objetivo de Ti salvo com sucesso!");
    }

    public boolean isEditando() {
        return objetivoTi.getId() != null;
    }

    public TipoObjetivo[] getTiposObjetivo() {
        return TipoObjetivo.values();
    }

    public ObjetivoTi getObjetivoTi() {
        return objetivoTi;
    }

    public void setObjetivoTi(ObjetivoTi objetivoTi) {
        this.objetivoTi = objetivoTi;
    }

}
