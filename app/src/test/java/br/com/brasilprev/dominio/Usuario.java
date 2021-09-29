package br.com.brasilprev.dominio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Usuario {
    private String name;
    private String job;
    private String email;

public Usuario(String name, String job, String email) {
        this.name = name;
        this.job = job;
        this.email = email;
    }

    public Usuario() {

    }
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
