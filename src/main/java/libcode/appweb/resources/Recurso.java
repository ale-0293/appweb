package libcode.appweb.resources;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Consumes;
import java.util.List;
import libcode.appweb.entidades.Alumno;
import libcode.appweb.negocio.DataService;
import jakarta.ws.rs.PathParam;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/alumnos")
public class Recurso {
    @EJB DataService servicio;

    @GET
    public Response getAlumnos() {
        List<Alumno> alumnos = servicio.getAlumnos();
        return Response.ok(alumnos).build();
    }

    @POST
    public Response saveAlumno(Alumno alumno) {
        servicio.saveAlumno(alumno);
        return Response.ok("Alumno guardado").build();
    }

    @PUT
    public Response editAlumno(Alumno alumno) {
        servicio.editAlumno(alumno);
        return Response.ok("Alumno editado").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAlumno(@PathParam("id") Integer id) {
        servicio.deleteAlumno(new Alumno(id));
        return Response.ok("Alumno eliminado").build();
    }
}
