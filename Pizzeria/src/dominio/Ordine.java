package dominio;

import java.time.LocalTime;
import java.util.Collection;

/**
 * questo ADT rappresenta un ordine che un cleinte vuole fare in una determinata ora
 */
public class Ordine {
    /**
     * l'ordine è rappresentato da un elenco di Cibi,un costo totale e l'ora in cui si è fatto
     * {pizza margherita, pennette al sugo.. [15:02], costo totale:20$}
     *len(ciboOrdinato)>0
     * costo>0
     * tutti gli attributi !=null
     */
private Collection<Cibo> ciboOrdinato;
private LocalTime oraOrdine;


    /**
     *
     * @param menu
     * @return vero se ogni cibo ordinato è presente nel menu,falso altrimenti
     */
    public Boolean ciboDisponibile(Menù menu){
        for(Cibo cibo : ciboOrdinato){
            if(!menu.getMenu().containsKey(cibo)){
                return false;
            }
        }
        return true;
    }

    public Collection<Cibo> getPiatti(){
        return ciboOrdinato;
    }

    public LocalTime getData(){return oraOrdine;}










}
