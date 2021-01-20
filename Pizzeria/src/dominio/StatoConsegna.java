package dominio;

import enumeratori.Stato;

public class StatoConsegna {
    private Comanda comanda;
    private Stato statoConsegna;


    public StatoConsegna(Comanda comanda){
        this.comanda = comanda;
        statoConsegna= Stato.DACONSEGNARE;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public Stato getStato() {
        return statoConsegna;
    }



}
