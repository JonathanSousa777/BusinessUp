package com.bunisessup.controller;

import com.bunisessup.model.Pergunta;
import com.bunisessup.repository.Perguntas;
import com.bunisessup.util.jsf.FacesUtil;
import java.io.Serializable;
import java.text.DecimalFormat;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CalcularBean implements Serializable {

    @Inject
    private Perguntas perguntas;

    private int nota;
    private int notaTotal;
    private double media;
    private Long contador;
    private Pergunta pergunta;

    public CalcularBean() {
        nota = 0;
        notaTotal = 0;
        media = 0;
        contador = new Long(0);
        pergunta = new Pergunta();
    }

    public void inicializar() {
        this.pergunta = perguntas.porId(contador);
        this.contador++;
    }

    public void passarPergunta() {
        if (contador.intValue() == 24) {
            calcularMedia();
        } else {
            this.pergunta = perguntas.porId(contador);
            notaTotal += nota;
            nota = 0;
            contador++;
        }
    }

    public void calcularMedia() {
        media = notaTotal / 24.0;
        DecimalFormat mascara = new DecimalFormat("#,##");
        media = Double.valueOf(mascara.format(media));
        FacesUtil.addErrorMessage("Avaliação concluída sua média é: " + media);
    }

    public void reiniciar() {
        nota = 0;
        notaTotal = 0;
        media = 0;
        contador = new Long(0);
        inicializar();
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public Long getContador() {
        return contador;
    }

    public void setContador(Long contador) {
        this.contador = contador;
    }

    public int getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(int notaTotal) {
        this.notaTotal = notaTotal;
    }
}
