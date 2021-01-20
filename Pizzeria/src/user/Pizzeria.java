package user;

import dominio.*;
import enumeratori.Stato;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * questa ADT rappresenta una pizzeria
 */
public class Pizzeria {
   private Collection<Tavolo> tavoliPizzeria;
   private Menù menù;
   private Collection<StatoConsegna> comandePizzeria;


    /**
     * modifica comandePizzeria aggiungendo la comanda appena creata associandola al tavolo
     * @param ordine
     * @param tavolo
     * @return la comanda creata(se possibile)
     * @throws CiboNonDisponibileException se il cibo dell'ordine non esiste nel menu
     */
   public Comanda creaComanda(Ordine ordine, Tavolo tavolo) throws CiboNonDisponibileException {
       if(ordine.ciboDisponibile(this.menù)){
           Factory f= new Factory();
           Comanda comanda= f.createComanda(ordine);
           tavolo.aggiungiComande(comanda);
           StatoConsegna sc= f.createConsegna(comanda);
           comandePizzeria.add(sc);
           return comanda;

       }
       else{
           throw new CiboNonDisponibileException("cibo non disponibile");
       }
   }


    /**
     *
     * @return la lista di comande non ancora consegnate
     * la lista può essere vuota --> tutte le comande sono state consegnate
     */
   public List<Comanda> estraiComandeNonConsegnate(){
       List<Comanda> comande= new ArrayList<>();
       for(StatoConsegna sc : comandePizzeria){
           if(sc.getStato().equals(Stato.DACONSEGNARE)){
               comande.add(sc.getComanda());
           }
       }
       return comande;
   }

    /**
     *
     * @param tavolo
     * @return il conto totale di quel tavolo
     */
   public int  contoTavolo(@NotNull Tavolo tavolo){
       return tavolo.contoTavolo(this.menù);

   }

}
