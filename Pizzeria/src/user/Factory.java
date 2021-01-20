package user;

import dominio.*;

public class Factory {

    public Comanda createComanda(Ordine richiesta){
        return new Comanda(richiesta);

    }

    public StatoConsegna createConsegna(Comanda comanda){
        return new StatoConsegna(comanda);
    }

    public Menù creaMenu(Cibo cibo,Integer costo){
        return new Menù(cibo,costo);
    }

}
