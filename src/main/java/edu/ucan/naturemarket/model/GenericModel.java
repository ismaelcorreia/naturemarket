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
public class GenericModel {
    
    private Long id;
    private Status status;
    private LocalDateTime createdAt;
}
