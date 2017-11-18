package com.bunisessup.service;

import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.repository.ObjetivosTi;
import com.bunisessup.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

public class CadastroObjetivoTiService implements Serializable {

    @Inject
    private ObjetivosTi objetivosTi;

    @Transactional
    public ObjetivoTi salvar(ObjetivoTi objetivoTi) {
        return objetivosTi.guardar(objetivoTi);
    }
}
