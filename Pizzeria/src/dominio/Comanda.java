package dominio;


import java.time.LocalTime;
import java.util.Collection;
import java.util.Iterator;

/**
 * questo ADT rappresenta una comanda per la pizzeria
 */
public class Comanda {
    /**
     *la comanda è rappresentata da un costo totale dovuto ai cibi che essa contiene
     * una data(di quando è stata creata) e uno statoConsegna che rappresenta lo stato(da consegnare o
     * gia consegata)
     */
private LocalTime dataComanda;
private Collection<Cibo> piattiComanda;

    public Comanda(Ordine ordine){
        this.dataComanda = ordine.getData();
        piattiComanda = ordine.getPiatti();
    }

    /**
     *
     * @param menu
     * @return il costo totale della comanda
     */
    public int costoComanda(Menù menu){
        Iterator<Cibo> it= piattiComanda.iterator();
        int costoTot=0;
        while(it.hasNext()){
            costoTot += menu.getMenu().get(it.next());
        }
        return costoTot;
    }




}
