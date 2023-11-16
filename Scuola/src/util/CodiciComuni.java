package util;

import java.util.Arrays;

public enum CodiciComuni {

    UD ("L483", "UDINE"),
    TS ("L486", "TRIESTE"),
    GO ("D969", "GORIZIA"),
    PN ("G942", "PORDENONE"),
    VE ("L736", "VENEZIA"),
    ;

    private final String codice;
    private final String citta;

    CodiciComuni(String codice, String citta) {
        this.codice = codice;
        this.citta = citta;
    }

    public String getCodice() {
        return codice;
    }

    public String getCitta() {
        return citta;
    }

    public static void main(String[] args) {
        System.out.println(CodiciComuni.UD.getCodice());
        System.out.println(Arrays.toString(CodiciComuni.values()));
    }
}
