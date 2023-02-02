package edu.ucan.naturemarket.model;

import java.util.List;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public class Fatura {
    private ContaCorrente destino;
    private List<FaturaItem> itens;
    
    public int getTotalProdutos() {
        if (itens == null) return  0;
        
        return itens.size();
        
    }
    public double getTotalFatura() {
        if (itens == null) return  0;
        
        double total = 0;
        for (FaturaItem item: itens) total+= item.getTotal();
        
        return total;
        
    }
    
}
