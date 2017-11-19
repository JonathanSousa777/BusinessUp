package com.bunisessup.converter;

import javax.faces.convert.FacesConverter;
import com.bunisessup.model.ObjetivoTi;
import com.bunisessup.repository.ObjetivosTi;
import com.bunisessup.util.cdi.CDIServiceLocator;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(forClass = ObjetivoTi.class)
public class ObjetivoTiConverter implements Converter {

    ObjetivosTi objetivosTi = CDIServiceLocator.getBean(ObjetivosTi.class);

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null) {
            return objetivosTi.porId(new Long(value));
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            ObjetivoTi objetivoTi = (ObjetivoTi) value;
            return objetivoTi.getId() == null ? null : objetivoTi.getId().toString();
        }

        return null;
    }

}
