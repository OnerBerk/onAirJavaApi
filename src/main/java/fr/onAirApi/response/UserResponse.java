package fr.onAirApi.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
    // @JsonIgnore si tu ne veux pas renvoyer ce field dans la reponse
    private long id;
    //@JsonProperty("Prenom") si tu veux changer le terme de la clé
    private String firstname;
    private String lastname;

    public UserResponse(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastame(String lastname) {
        this.lastname = lastname;
    }


}
