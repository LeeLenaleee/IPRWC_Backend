package nl.hsleiden.model;

import com.fasterxml.jackson.annotation.JsonView;
import nl.hsleiden.View;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.security.Principal;

@Table(name = "gebruiker")
@Entity
public class GebruikerModel extends BaseModel implements Principal {
    @Column(name = "email_adres")
    @NotEmpty
    @Email
    @JsonView(View.Public.class)
    private String emailAdres;

    @Column(name = "gebruikersnaam")
    @NotEmpty
    @Email
    @JsonView(View.Public.class)
    private String gebruikersnaam;

    @Column(name = "wachtwoord")
    @NotEmpty
    @Length(min = 8)
    @JsonView(View.Internal.class)
    private String wachtwoord;


    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    @JsonView(View.Public.class)
    private Role role;


    public GebruikerModel() {
    }

    public GebruikerModel(String emailAdres, String wachtwoord, Role role) {
        this.emailAdres = emailAdres;
        this.wachtwoord = wachtwoord;
        this.role = role;
    }

    public GebruikerModel(String gebruikersnaam, String email, String password, Role user) {
        this.gebruikersnaam = gebruikersnaam;
        this.emailAdres = email;
        this.wachtwoord = password;
        this.role = user;
    }

    public boolean hasRole(Role role) {
        return this.role.hasRole(role);
    }

    public String getName() {
        return this.emailAdres;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }
}