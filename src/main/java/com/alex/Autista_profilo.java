package com.alex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadFactory;

public class Autista_profilo {
    

    public int MAX_VIAGGI;


    public void crea_profilo()throws Exception{
        InputStreamReader lettore = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(lettore);
        Autisti autista = new Autisti();
        Autisti profili[] = new Autisti[MAX_VIAGGI];
        int num_profilo = 0;
        String line;
        try {
            //nome, cognome, sesso, numero, scadenza_patente, numero_patente, email;
            System.out.println("inserire i propri dati");  
            Thread.sleep(1000);

            System.out.println("inserire il proprio nome: ");
            line = input.readLine();
            autista.setNome(line);

            System.out.println("inserire il proprio cognome: ");
            line = input.readLine();
            autista.setCognome(line);

            System.out.println("inserire il proprio sesso: ");
            line = input.readLine();
            autista.setSesso(line);

            System.out.println("inserire il proprio numero: ");
            line = input.readLine();
            autista.setNumero(line);

            System.out.println("inserire la data della scadenza della patente: D/M/Y");
            line = input.readLine();
            autista.setScadenza_patente(line);

            System.out.println("inserire il numero della patente");
            line = input.readLine();
            autista.setNumero_patente(line);
            
            System.out.println("inserire la propria email: ");
            line = input.readLine();
            autista.setEmail(line);

            System.out.println("Inserire i dati della macchina");
            Thread.sleep(1000);

            System.out.println("inserire il modello: ");
            line = input.readLine();
            autista.setModello_macchina(line);

            System.out.println("inserire l'anno di produzione: ");
            line = input.readLine();
            autista.setAnno(line);

            System.out.println("inserire il numero di posti:");
            line = input.readLine();
            autista.setPosti(line);
            //String modello_macchina, anno, posti

            System.out.println("il profilo è esatto? Y/N");
            System.out.println(autista.toString());
            line = input.readLine();

            if (line.equalsIgnoreCase("Y")) {
                System.out.println("profilo creato");
                profili[num_profilo] = autista;
                num_profilo++;
            } else {
                System.out.println("profilo non creato");
                crea_profilo();
            }
            
        } catch (IOException e) {
            System.out.println("errore generico");
            System.exit(3);
        } catch (InterruptedException e){
            System.out.println("errore sul thread");
            System.exit(4);
        } catch (IndexOutOfBoundsException e){
            System.out.println("errore di indice nell'array il programma terminerà");
            System.exit(2);
        }
    }
}
