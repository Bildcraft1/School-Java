package util;

public class CodiceFiscale {
    public static String generaCF(String nome, String cognome, String dataNascita, String luogoNascita, String sesso) {
        StringBuilder cf = new StringBuilder();

        // Aggiungi i codici relativi al cognome e al nome.
        cf.append(getCodeFromName(cognome.toUpperCase().replaceAll("\\s", "")));
        cf.append(getCodeFromName(nome.toUpperCase().replaceAll("\\s", "")));

        // Aggiungi il codice relativo alla data di nascita e al sesso.
        cf.append(getCodeFromDateAndSex(dataNascita, sesso));

        // Aggiungi il codice del comune di nascita.
        cf.append(getCodeFromPlace(luogoNascita));

        if(cf.toString().contains("NON ESISTENTE")) return "Codice comune non esistente";

        // Calcola il carattere di controllo e aggiungilo.
        cf.append(calcolaCarattereControllo(cf.toString()));

        return cf.toString();
    }

    private static char calcolaCarattereControllo(String cf) {
        int somma = 0;
        int[] valoriPari = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int[] valoriDispari = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23};

        for (int i = 0; i < 15; i++) {
            char c = cf.charAt(i);
            int valoreNumerico = Character.isDigit(c) ? Character.getNumericValue(c) : (c - 'A');

            // Usa la tabella dei valori per le posizioni pari o dispari.
            somma += (i % 2 == 0) ? valoriDispari[valoreNumerico] : valoriPari[valoreNumerico];
        }

        // Converti il resto della divisione in una lettera.
        return (char) ('A' + (somma % 26));
    }


    private static String getCodeFromPlace(String luogoNascita) {
        for (int i = 0; i < CodiciComuni.values().length; i++) {
            if (CodiciComuni.values()[i].getCitta().equalsIgnoreCase(luogoNascita)) {
                return CodiciComuni.values()[i].getCodice();
            }
        }
        return "NON ESISTENTE";
    }

    private static String getCodeFromDateAndSex(String dataNascita, String sesso) {
        // Estrai l'anno, il mese e il giorno dalla data di nascita.
        String[] splitDate = dataNascita.split("/");
        int giorno = Integer.parseInt(splitDate[0]);
        int mese = Integer.parseInt(splitDate[1]);
        int anno = Integer.parseInt(splitDate[2]);

        // Converti l'anno in una stringa di due caratteri.
        String annoCodice = String.format("%02d", anno % 100);

        // Converti il mese in una lettera.
        String meseCodice = getMeseCodice(mese);

        // Aggiungi 40 al giorno se il sesso è femminile.
        if (sesso.equalsIgnoreCase("F")) {
            giorno += 40;
        }

        // Converti il giorno in una stringa di due caratteri.
        String giornoCodice = String.format("%02d", giorno);

        // Combina tutto insieme.
        return annoCodice + meseCodice + giornoCodice;
    }

    private static String getMeseCodice(int mese) {
        String[] codiciMese = {"A", "B", "C", "D", "E", "H", "L", "M", "P", "R", "S", "T"};
        return codiciMese[mese - 1]; // -1 perché l'array inizia da 0 mentre i mesi da 1.
    }


    private static String getCodeFromName(String nome) {
        StringBuilder code = new StringBuilder();

        // Aggiungi le consonanti.
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                code.append(c);
            }
        }

        // Aggiungi le X.
        while (code.length() < 3) {
            code.append('X');
        }

        // Tronca a 3 caratteri.
        return code.substring(0, 3);
    }

    public static void main(String[] args) {
        System.out.println(generaCF("Andrea", "Moro Detto Rocco", "20/02/2006", "PORTOGURATO", "M"));
    }

}
