package com.alex;
public class Passeggeri {
    String nome, cognome, sesso, numero, scadenza_patente, numero_patente, email;
    String modello_macchina, anno, posti;

    Passeggeri(){
        this.nome = "";
        this.cognome = "";
        this.sesso = "";
        this.numero = "";
        this.scadenza_patente = "";
        this.numero_patente = "";
        this.email = "";
        this.modello_macchina = "";
        this.anno = "";
        this.posti = "";
    }

    Passeggeri(String nome, String cognome, String sesso, String numero, String scadenza_patente, String numero_patente, String email,
                 String modello_macchina, String anno, String posti){
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getScadenza_patente() {
        return scadenza_patente;
    }

    public void setScadenza_patente(String scadenza_patente) {
        this.scadenza_patente = scadenza_patente;
    }

    public String getNumero_patente() {
        return numero_patente;
    }

    public void setNumero_patente(String numero_patente) {
        this.numero_patente = numero_patente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModello_macchina() {
        return modello_macchina;
    }

    public void setModello_macchina(String modello_macchina) {
        this.modello_macchina = modello_macchina;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getPosti() {
        return posti;
    }

    public void setPosti(String posti) {
        this.posti = posti;
    }

    
    
}
