package com.alex;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inizializzazione_programma {

    public static void main(String[] args) throws Exception
    {
        InputStreamReader lettore = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(lettore);
        Autista_viaggio autista_viaggio  = new Autista_viaggio();
        Autista_profilo autista_profilo = new Autista_profilo();
        String line;
        String scelta;
        int num_celle;
        boolean flag = true;
        if (flag) {
            System.out.println("inserire il numero di posti da allocare ");
            line = input.readLine();
            num_celle = Integer.parseInt(line);

            autista_viaggio.set_lunghezza_array(num_celle);

        }
        
        System.out.println("inserire la propria scelta");
        Thread.sleep(500);
        System.out.println("crea viaggio: cv");
        Thread.sleep(500);
        System.out.println("carica viaggio: av");
        Thread.sleep(500);
        System.out.println("crea profilo: cp");
        System.out.println("esci: exit");
        scelta  = input.readLine();

        switch (scelta) {
            case "cv":
                autista_viaggio.crea_viaggio();
                break;
            case "av":
                autista_viaggio.carica_viaggio();
                break;
            case "cp":
                autista_profilo.crea_profilo();
                break;
            case "exit":
                System.out.println("si è certi di voler uscire? Y/N");
                scelta = input.readLine();
                if (scelta.equals("Y")) {
                    System.exit(1);
                } else {
                    main(args);
                }
            default:
                System.out.println("scelta invalida il programma terminerà");
                
                break;
        }

    
    }
}
