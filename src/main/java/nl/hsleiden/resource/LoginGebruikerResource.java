package nl.hsleiden.resource;

import com.fasterxml.jackson.annotation.JsonView;
import io.dropwizard.hibernate.UnitOfWork;
import nl.hsleiden.View;
import nl.hsleiden.model.CredentialsModel;
import nl.hsleiden.model.GebruikerModel;
import nl.hsleiden.model.RegisterModel;
import nl.hsleiden.model.Role;
import nl.hsleiden.service.GebruikerService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

/**
 * @author Jacco van den Berg
 */
@Provider
@Singleton
@Path("/login")
public class LoginGebruikerResource {
    private final GebruikerService service;

    @Inject
    public LoginGebruikerResource(GebruikerService service) {
        this.service = service;
    }

    @POST
    @UnitOfWork
    @Consumes(MediaType.APPLICATION_JSON)
    @JsonView(View.Public.class)
    @Produces(MediaType.APPLICATION_JSON)
    public GebruikerModel get(@Valid CredentialsModel credentials) {
        return service.getByCredentials(credentials.getGebruikersnaam(), credentials.getWachtwoord())
                .orElseThrow(() -> new NotAuthorizedException("Required credentials"));
    }

    /*@POST
    @Path("/register")
    @UnitOfWork
    @Consumes(MediaType.APPLICATION_JSON)
    @JsonView(View.Public.class)
    public void signUp(@Valid RegisterModel registerModel) {
        System.err.println("test");
        GebruikerModel gebruikerModel = new GebruikerModel();
        gebruikerModel.setEmailAdres(registerModel.getEmail());
        gebruikerModel.setGebruikersnaam(registerModel.getGebruikersnaam());
        gebruikerModel.setWachtwoord(registerModel.getWachtwoord());
        gebruikerModel.setRole(Role.USER);
        service.create(gebruikerModel);
    }*/

    @GET
    @Path("/register")
    @UnitOfWork
    @Consumes(MediaType.APPLICATION_JSON)
    @JsonView(View.Public.class)
    public String signUp(@QueryParam("email") String email, @QueryParam("gebruikersnaam") String gebruikersnaam, @QueryParam("password") String password) {
        GebruikerModel gebruikerModel = new GebruikerModel(gebruikersnaam, email, password, Role.USER);
        service.create(gebruikerModel);
        return email+gebruikersnaam+password;
    }

    /*@GET
    @Path("/register")
    @UnitOfWork
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @JsonView(View.Public.class)
    public String signUp(@QueryParam("email") String email, @QueryParam("gebruikersnaam") String gebruikersnaam, @QueryParam("password") String password) {
        GebruikerModel gebruikerModel = new GebruikerModel(gebruikersnaam, email, password, Role.USER);
        //service.signUp(gebruikerModel);
        return email + gebruikersnaam+password;
    }*/
}
