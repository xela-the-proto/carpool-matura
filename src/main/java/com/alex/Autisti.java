package com.alex;
public class Autisti {

    protected String nome, cognome, sesso, numero, scadenza_patente, numero_patente, email;
    protected String modello_macchina, anno;
    protected int posti;

    Autisti() {
        this.nome = "";
        this.cognome = "";
        this.sesso = "";
        this.numero = "";
        this.scadenza_patente = "";
        this.numero_patente = "";
        this.email = "";
        this.modello_macchina = "";
        this.anno = "";
        this.posti = 0;
    }

    Autisti(String nome, String cognome, String sesso, String numero, String scadenza_patente, String numero_patente,
            String email,
            String modello_macchina, String anno, int posti) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.numero = numero;
        this.scadenza_patente = scadenza_patente;
        this.numero_patente = numero_patente;
        this.email = email;
        this.modello_macchina = modello_macchina;
        this.anno = anno;
        this.posti = posti;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getCognome() {
        return cognome;
    }

    void setCognome(String cognome) {
        this.cognome = cognome;
    }

    String getSesso() {
        return sesso;
    }

    void setSesso(String sesso) {
        this.sesso = sesso;
    }

    String getNumero() {
        return numero;
    }

    void setNumero(String numero) {
        this.numero = numero;
    }

    String getScadenza_patente() {
        return scadenza_patente;
    }

    void setScadenza_patente(String scadenza_patente) {
        this.scadenza_patente = scadenza_patente;
    }

    String getNumero_patente() {
        return numero_patente;
    }

    void setNumero_patente(String numero_patente) {
        this.numero_patente = numero_patente;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getModello_macchina() {
        return modello_macchina;
    }

    void setModello_macchina(String modello_macchina) {
        this.modello_macchina = modello_macchina;
    }

    String getAnno() {
        return anno;
    }

    void setAnno(String anno) {
        this.anno = anno;
    }

    int getPosti() {
        return posti;
    }

    void setPosti(String posti) {
        this.posti = Integer.parseInt(posti);
    }

    public String toString(){
        return "Nome: " + nome + "\nCognome: " + cognome + "\nSesso: " + sesso + "\nNumero: " + numero + "\nScadenza Patente: " + scadenza_patente + "\nNumero Patente: " + numero_patente + "\nEmail: " + email + "\nModello Macchina: " + modello_macchina + "\nAnno: " + anno + "\nPosti: " + posti;
    }
}
