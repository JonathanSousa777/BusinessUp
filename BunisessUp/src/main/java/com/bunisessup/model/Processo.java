package com.bunisessup.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_processo")
public class Processo implements Serializable {

    private Long id;
    private String descricao;
    private String sigla;
    private List<ObjetivoTi> objetivosTi = new ArrayList<>();
    private RecursoTi recursoTi;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @ManyToMany
    @JoinTable(name = "processo_objetivoTi", joinColumns = @JoinColumn(name = "processo_id"),
            inverseJoinColumns = @JoinColumn(name = "objetivoTi_id"))
    public List<ObjetivoTi> getObjetivosTi() {
        return objetivosTi;
    }

    public void setObjetivosTi(List<ObjetivoTi> objetivosTi) {
        this.objetivosTi = objetivosTi;
    }

    @Column(name = "recurso_ti")
    @Enumerated(EnumType.STRING)
    public RecursoTi getRecursoTi() {
        return recursoTi;
    }

    public void setRecursoTi(RecursoTi recursoTi) {
        this.recursoTi = recursoTi;
    }

    @Column
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Processo other = (Processo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
