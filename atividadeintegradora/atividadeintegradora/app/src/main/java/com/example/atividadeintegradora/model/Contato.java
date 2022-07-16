package com.example.atividadeintegradora.model;

public class Contato {
    private int id;
    private String nome;
    private String nomesocial;
    private String genero;
    private String pai;
    private String mae;
    private double renda;

    public Contato(String nome, String nomesocial, String genero, String pai, String mae, double renda) {
        this.nome = nome;
        this.nomesocial = nomesocial;
        this.genero = genero;
        this.pai = pai;
        this.mae = mae;
        this.renda = renda;

    }
    public  Contato(int id, String nome, String nomesocial, String genero, String pai, String mae, double renda){
        this.id = id;
        this.nome = nome;
        this.nomesocial = nomesocial;
        this.genero = genero;
        this.pai = pai;
        this.mae = mae;
        this.renda = renda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomesocial() {
        return nomesocial;
    }

    public void setNomesocial(String nomesocial) {
        this.nomesocial = nomesocial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}