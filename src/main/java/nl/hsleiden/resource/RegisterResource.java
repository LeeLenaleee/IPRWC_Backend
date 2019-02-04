package nl.hsleiden.resource;

import com.fasterxml.jackson.annotation.JsonView;
import io.dropwizard.hibernate.UnitOfWork;
import nl.hsleiden.View;
import nl.hsleiden.model.GebruikerModel;
import nl.hsleiden.model.RegisterModel;
import nl.hsleiden.model.Role;
import nl.hsleiden.service.GebruikerService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Provider
@Singleton
@Path("/register")
public class RegisterResource {
    private final GebruikerService service;

    @Inject
    public RegisterResource(GebruikerService service) {
        this.service = service;
    }


    @POST
    @UnitOfWork
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.WILDCARD)
    @JsonView(View.Public.class)
    public void signUp(@Valid RegisterModel registerModel) {
        System.err.println("test");
        GebruikerModel gebruikerModel = new GebruikerModel();
        gebruikerModel.setEmailAdres(registerModel.getEmail());
        gebruikerModel.setGebruikersnaam(registerModel.getGebruikersnaam());
        gebruikerModel.setWachtwoord(registerModel.getWachtwoord());
        gebruikerModel.setRole(Role.USER);
        service.create(gebruikerModel);
    }
}
