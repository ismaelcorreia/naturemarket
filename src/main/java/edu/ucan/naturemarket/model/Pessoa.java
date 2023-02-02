package edu.ucan.naturemarket.model;

import edu.ucan.naturemarket.model.enumerator.EstadoCivil;
import edu.ucan.naturemarket.model.enumerator.Sexo;
import edu.ucan.naturemarket.model.local.Endereco;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa extends GenericModel{
    
    private String nome; 
    private String numeroBilhete; 
    private Pessoa pai;
    private Pessoa mae;
    private Pessoa conjuge;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private LocalDate dataNascimento;
    private Float altura;
    private LocalDate dataExpiracaoDocumento;
    private Endereco provinciaNascimento;
    private Endereco naturalidade;
    private Endereco residencia;
    
}
