package dominio;

import java.util.HashMap;
import java.util.Map;

/**
 * questo ADT rappresenta il menù di un ristorante
 */
public class Menù {
    /**
     * len(menu) >0
     * A.F. è una funzione che ti mappa ogni cibo con il suo costo
     */

    private Map<Cibo, Integer> menu;



    public Menù(Cibo cibo,int costo){
        this.menu = new HashMap<Cibo, Integer>();
        this.menu.put(cibo, costo);
    }


    public Map<Cibo, Integer> getMenu(){
        return menu;
    }


    public void aggiungiCibo(Cibo cibo,int costo){
        this.menu.put(cibo,costo);
    }
}
