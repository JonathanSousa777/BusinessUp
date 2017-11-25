package com.bunisessup.controller;

import com.bunisessup.model.Maturidade;
import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.model.Processo;
import com.bunisessup.model.RecursoTi;
import com.bunisessup.repository.Processos;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Jonathan Sousa
 */
@Named
@ViewScoped
public class CadastroProcessoBean implements Serializable {

    @Inject
    private Processo processo;

    @Inject
    private Processos processos;

    private List<ObjetivoTi> listObjetivoTi = new ArrayList<>();
    private ObjetivoTi objetivoTiSelecionado;

    public CadastroProcessoBean() {
        limpar();
    }

    public void salvar() {
        this.processo.setObjetivosTi(listObjetivoTi);
        this.processos.salvar(this.processo);
        limpar();

        FacesUtil.addMessage("Processo salvo com sucesso!");
    }

    public void adicionarObjetivoTi() {
        listObjetivoTi.add(objetivoTiSelecionado);
        objetivoTiSelecionado = new ObjetivoTi();
    }
    
    public void removerObjetivoTi() {
        listObjetivoTi.remove(objetivoTiSelecionado);
        objetivoTiSelecionado = new ObjetivoTi();
    }

    private void limpar() {
        processo = new Processo();
        objetivoTiSelecionado = new ObjetivoTi();
        listObjetivoTi = new ArrayList<>();
    }

    public RecursoTi[] getRecursosTi() {
        return RecursoTi.values();
    }

    public boolean isEditando() {
        return processo.getId() != null;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        if (processo != null) {
            this.processo = processo;
            this.listObjetivoTi = this.processo.getObjetivosTi();
        }
    }

    public ObjetivoTi getObjetivoTiSelecionado() {
        return objetivoTiSelecionado;
    }

    public void setObjetivoTiSelecionado(ObjetivoTi objetivoTiSelecionado) {
        this.objetivoTiSelecionado = objetivoTiSelecionado;
    }

    public List<ObjetivoTi> getListObjetivoTi() {
        return listObjetivoTi;
    }

    public void setListObjetivoTi(List<ObjetivoTi> listObjetivoTi) {
        this.listObjetivoTi = listObjetivoTi;
    }
}
