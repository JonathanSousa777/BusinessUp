package com.bunisessup.converter;

import com.bunisessup.model.Processo;
import com.bunisessup.repository.Processos;
import com.bunisessup.util.cdi.CDIServiceLocator;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Processo.class)
public class ProcessoConverter implements Converter {

    Processos processos = CDIServiceLocator.getBean(Processos.class);

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null) {
            return processos.porId(new Long(value));
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Processo processo = (Processo) value;
            return processo.getId() == null ? null : processo.getId().toString();
        }

        return null;
    }
}
