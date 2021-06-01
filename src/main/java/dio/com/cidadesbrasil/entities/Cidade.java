package dio.com.cidadesbrasil.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {
    @Id
    private Long id;
    private String nome;
    private Double latitude;
    private Double longitude;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private Estado uf;

}

