package nl.hsleiden.resource;

import io.dropwizard.hibernate.UnitOfWork;
import nl.hsleiden.model.MusicModel;
import nl.hsleiden.persistence.MusicDAO;
import nl.hsleiden.service.MusicService;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/music")
public class MusicResource extends BaseResource<MusicModel, MusicDAO, MusicService> {

    @Inject
    public MusicResource(MusicService service) {
        super(service);
    }

    @Path("/x")
    @GET
    @UnitOfWork
    @Produces(MediaType.TEXT_PLAIN)
    public String getFile() {
        return "it works";
    }

}
