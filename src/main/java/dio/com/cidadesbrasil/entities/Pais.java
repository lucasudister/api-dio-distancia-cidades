package dio.com.cidadesbrasil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pais")
public class Pais implements Serializable {
    @Id
    private Long id;
    private String nome;
    private String sigla;
    private Integer bacen;
}
