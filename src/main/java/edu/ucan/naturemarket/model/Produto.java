package edu.ucan.naturemarket.model;

import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
@Data
public class Produto extends GenericDescriptorModel{
    
    private String imagemUrl;
    private Double preco;
    private Double quantidade;
    private CategoriaProduto categoria;
    private Fornecedor fornecedor;

    public Produto(String designacao, String descricao) {
        super(designacao, descricao);
    }
    
    
}
