package edu.ucan.naturemarket.model;

import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */

@Data
public class PlanoSubscricao extends GenericDescriptorModel{
    
    private Double preco;
    private Integer numDias;
}
