package nl.hsleiden.model;

public class RegisterModel{
    private String username;
    private String email;
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
