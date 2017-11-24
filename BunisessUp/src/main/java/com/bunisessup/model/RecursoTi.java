package com.bunisessup.model;

import java.io.Serializable;

public enum RecursoTi implements Serializable {
    APLICACOES("Aplicações"),
    INFORMACAO("Informação"),
    INFRAESTRUTURA("Infraestrutura"),
    PESSOAS("Pessoas");

    private String descricao;

    private RecursoTi(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
