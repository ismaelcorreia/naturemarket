package edu.ucan.naturemarket.model;

import edu.ucan.naturemarket.model.enumerator.Status;
import java.time.LocalDateTime;
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
public class GenericDescriptorModel extends GenericModel{
    private String designacao;
    private String descricao;

    public GenericDescriptorModel(Long id, Status status, LocalDateTime createdAt) {
        super(id, status, createdAt);
    }

    public GenericDescriptorModel( Long id, Status status, String designacao, String descricao, LocalDateTime createdAt) {
        super(id, status, createdAt);
        this.designacao = designacao;
        this.descricao = descricao;
    }
    
    
}
