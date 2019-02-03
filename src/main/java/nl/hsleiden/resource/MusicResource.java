package nl.hsleiden.resource;

import com.fasterxml.jackson.annotation.JsonView;
import io.dropwizard.hibernate.UnitOfWork;
import nl.hsleiden.View;
import nl.hsleiden.model.MusicModel;
import nl.hsleiden.persistence.MusicDAO;
import nl.hsleiden.service.MusicService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Singleton
@Path("/music")
public class MusicResource extends BaseResource<MusicModel, MusicDAO, MusicService> {

    @Inject
    public MusicResource(MusicService service) {
        super(service);
    }

    @RolesAllowed("ADMIN")
    @Override
    @POST
    @UnitOfWork
    @JsonView(View.Public.class)
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(@Valid MusicModel model) {
        service.create(model);
    }

    @RolesAllowed("ADMIN")
    @Override
    @DELETE
    @Path("/{id}")
    @UnitOfWork
    @JsonView(View.Public.class)
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") int id) {
        service.delete(service.findById(id));
    }

    @RolesAllowed("ADMIN")
    @Override
    @PUT
    @Path("/{id}")
    @UnitOfWork
    @JsonView(View.Public.class)
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(@PathParam("id") int id, @Valid MusicModel model) {
        service.update(model, id);
    }

    @GET
    @Path("/random")
    @UnitOfWork
    @JsonView(View.Public.class)
    @Produces(MediaType.APPLICATION_JSON)
    public MusicModel getRandom() {
        return service.getRandom();
    }

    @GET
    @Path("/zoek/")
    @UnitOfWork
    @JsonView(View.Protected.class)
    @Produces(MediaType.APPLICATION_JSON)
    public List<MusicModel> findByOmschrijving(@QueryParam("omschrijving") String omschrijving) {
        return service.findByOmschrijving(omschrijving);
    }

}
