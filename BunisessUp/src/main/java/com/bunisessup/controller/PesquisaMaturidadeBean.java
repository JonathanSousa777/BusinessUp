package com.bunisessup.controller;

import com.bunisessup.model.Maturidade;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaMaturidadeBean implements Serializable {

    public Maturidade[] getMaturidades() {
        return Maturidade.values();
    }

}
