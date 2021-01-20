package dominio;

import java.util.Collection;

/**
 * questo ADT rappresenta il tavolo dove i clienti possono ordinare
 */
public class Tavolo {
    /**
     * è rappresentato dall'elenco di tutte le comande associate ad esso
     * len(comandeAssociate)>=0
     */
    private Collection<Comanda> comandeAssociate;



    /**
     * modifica this aggiungendo la comanda passata a comandeAssociate
     * @param comanda
     */
    public void aggiungiComande(Comanda comanda){
        comandeAssociate.add(comanda);
    }

    /**
     *
     * @return il conto totale del tavolo
     */
    public int contoTavolo(Menù menu){
        int contoTotale=0;
        for(Comanda comanda:comandeAssociate){
            contoTotale+= comanda.costoComanda(menu);
        }
        return contoTotale;
    }

}
