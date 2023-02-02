package edu.ucan.naturemarket.model;

import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */

@Data
public class Subscricao extends GenericModel{
    
    PlanoSubscricao plano;
    ContaCorrente conta;
    LocalDate dataSubscricao;
    LocalDate dataExpiracao;
}
