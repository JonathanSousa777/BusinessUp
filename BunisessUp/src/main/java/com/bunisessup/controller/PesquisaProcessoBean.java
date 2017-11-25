package com.bunisessup.controller;

import com.bunisessup.model.Processo;
import com.bunisessup.repository.Processos;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaProcessoBean implements Serializable {

    @Inject
    private Processos processos;

    private Processo processo;
    private List<Processo> listProcessos;

    public PesquisaProcessoBean() {
        this.processo = new Processo();
        this.listProcessos = new ArrayList<>();
    }

    public void excluir() {
        processos.remover(this.processo);
        listProcessos.remove(this.processo);

        FacesUtil.addMessage("Processo excluído com sucesso!");
    }

    public void inicializar() {
        this.listProcessos = processos.todos();
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public List<Processo> getListProcessos() {
        return listProcessos;
    }

    public void setListProcessos(List<Processo> listProcessos) {
        this.listProcessos = listProcessos;
    }
}
