package co.com.poli.street57.street.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipos_generos")
public class TiposGenerosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_genero")
    private Long idTipoGenero;

    @Column(name = "genero")
    private String genero;
}
