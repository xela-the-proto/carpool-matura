package com.alex;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


    /*
    Per ogni viaggio che intendono condividere, gli autisti devono indicare città di partenza, città di
    destinazione, data ed ora di partenza, contributo economico richiesto ad ogni passeggero, tempi di
    percorrenza stimati. È responsabilità dell’autista, mano a mano che accetterà passeggeri per un certo
    viaggio, dichiarare chiuse le prenotazioni per quel viaggio, utilizzando un’apposita funzione sul
    portale
    */

public class Autista_viaggio{

    private Autisti profili[];

    public int MAX_VIAGGI;

    public void salva_viaggio() throws IOException{
        ObjectOutputStream out_stream = new ObjectOutputStream(new FileOutputStream("viaggio.bin"));
        //TODO:write file
        out_stream.close();
    }

    
    public void carica_viaggio() throws IOException, FileNotFoundException{

        ObjectInputStream in_stream = new ObjectInputStream(new FileInputStream("viaggio.bin"));

        try {
            //TODO: read class file
        } catch (Exception e) {
            //TODO: handle exception
        }
        in_stream.close();
        
    }

    public void crea_viaggio(){
        
    }


    public void set_lunghezza_array(int MAX_VIAGGI){
        this.MAX_VIAGGI = MAX_VIAGGI;
    }
}