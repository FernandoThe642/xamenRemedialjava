
package examen63.services;

import examen63.model.Solicitud;
import examen63.business.SolicitudService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/solicitud")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SolicitudResource {

    @Inject
    private SolicitudService solicitudService;

    @POST
    public Response createSolicitud(Solicitud solicitud) {
        return Response.ok(solicitudService.createSolicitud(solicitud)).build();
    }
    
  
}
