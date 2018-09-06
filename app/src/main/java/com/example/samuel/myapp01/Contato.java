package com.example.samuel.myapp01;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contato> createContactsList(int numeroContatos){
        ArrayList<Contato> contatos = new ArrayList<Contato>();

        for(int i = 1; i <= numeroContatos; i++) {
            contatos.add(new Contato("Pessoa " + ++lastContactId, "0000-0000"));
        }
        lastContactId = 0;
        return contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
