package edu.ucan.naturemarket.model;

import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
@Data
public class Utilizador extends GenericModel{
    
    private Pessoa pessoa;
    private String nomeUtilizador;
    private String senha;
}
