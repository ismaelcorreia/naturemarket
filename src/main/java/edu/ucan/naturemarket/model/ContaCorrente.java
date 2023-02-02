package edu.ucan.naturemarket.model;

import edu.ucan.naturemarket.model.enumerator.TipoConta;
import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
@Data
public class ContaCorrente extends GenericModel{
    
    private String banco;
    private String numeroCartao;
    private Utilizador utilizador;
    private Double saldo;
    private TipoConta tipoConta = TipoConta.Cliente;
}
