package edu.ucan.naturemarket.model.local;

import edu.ucan.naturemarket.model.GenericDescriptorModel;
import edu.ucan.naturemarket.model.enumerator.Status;
import java.time.LocalDateTime;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public class Endereco extends GenericDescriptorModel{

    public Endereco(Long id, Status status, LocalDateTime createdAt) {
        super(id, status, createdAt);
    }

    public Endereco(Long id, Status status, String designacao, String descricao, LocalDateTime createdAt) {
        super(id, status, designacao, descricao, createdAt);
    }

    public Endereco(String designacao, String descricao) {
        super(designacao, descricao);
    }

    public Endereco() {
    }
    
     
    

}
