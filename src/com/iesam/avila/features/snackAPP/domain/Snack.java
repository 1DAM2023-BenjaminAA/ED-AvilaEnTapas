package com.iesam.avila.features.snackAPP.domain;

public class Snack {
    public String id;
    public String nombre;
    public String descripcion;
    public String direccion;
    public String totalPuntos;
    public String numParticipantes;
    public String totalVotos;
    public String ingredientes;
    public String contacto;


    public Snack(String id, String nombre, String descripcion, String establecimiento, String totalPuntos, String numParticipantes, String totalVotos, String ingredientes, String direccion){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.direccion=direccion;
        this.totalPuntos=totalPuntos;
        this.numParticipantes=numParticipantes;
        this.totalVotos= totalVotos;
        this.ingredientes=ingredientes;
        this.contacto=contacto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(String totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public String getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(String numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
