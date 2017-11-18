package com.bunisessup.model;

import java.io.Serializable;

public enum TipoObjetivo implements Serializable {
    PRIMARIO("Primário"),
    SECUNDARIO("Secundário");

    private String descricao;

    private TipoObjetivo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
