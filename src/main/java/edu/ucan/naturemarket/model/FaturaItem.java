package edu.ucan.naturemarket.model;

import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */

@Data
public class FaturaItem {
    private Fatura fatura;
    private Produto produto;
    private Double quantidade;
    
    public double getTotal() {
        return produto.getPreco() * quantidade;
    }
}
