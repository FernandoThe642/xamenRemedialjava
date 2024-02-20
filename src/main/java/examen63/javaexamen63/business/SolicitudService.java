package examen63.business;

import examen63.model.Solicitud;
import examen63.dao.SolicitudDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;

@Stateless
public class SolicitudService {
    
    @Inject
    private SolicitudDAO solicitudDAO;

    public Solicitud createSolicitud(Solicitud solicitud) {
        solicitud.setFecha(new Date());
        solicitudDAO.create(solicitud);
        return solicitud;
    }
}
