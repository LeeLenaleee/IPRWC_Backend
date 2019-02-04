package nl.hsleiden.service;

import nl.hsleiden.model.GebruikerModel;
import nl.hsleiden.model.RegisterModel;
import nl.hsleiden.model.Role;
import nl.hsleiden.persistence.GebruikerDAO;

import javax.inject.Inject;
import java.util.Optional;

public class GebruikerService extends BaseService<GebruikerModel, GebruikerDAO> {
    @Inject
    public GebruikerService(GebruikerDAO dao) {
        super(dao);
    }

    public Optional<GebruikerModel> getByCredentials(String username, String wachtwoord) {
        return dao.getByCredentials(username, wachtwoord);
    }

    public void signUp(RegisterModel registerModel) {
        System.err.println("test2");
        GebruikerModel gebruikerModel = new GebruikerModel();
        gebruikerModel.setEmailAdres(registerModel.getEmail());
        gebruikerModel.setGebruikersnaam(registerModel.getGebruikersnaam());
        gebruikerModel.setWachtwoord(registerModel.getWachtwoord());
        gebruikerModel.setRole(Role.USER);
        dao.create(gebruikerModel);
    }
}
