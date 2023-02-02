package edu.ucan.naturemarket.model;

import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
@Data
public class Fornecedor extends GenericModel{
    
    private ContaCorrente titular;
    private String nif;
}
