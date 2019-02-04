package nl.hsleiden.model;

import com.fasterxml.jackson.annotation.JsonView;
import nl.hsleiden.View;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterModel{
    @NotEmpty
    @JsonView(View.Public.class)
    private String username;
    @NotEmpty
    @JsonView(View.Public.class)
    private String email;
    @NotEmpty
    @JsonView(View.Public.class)
    private String password;

    public RegisterModel(){}

    public String getGebruikersnaam() {
        return username;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.username = gebruikersnaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return password;
    }

    public void setWachtwoord(String wachtwoord) {
        this.password = wachtwoord;
    }
}
