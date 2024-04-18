package co.com.poli.street57.street.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipos_colores")
public class TiposColoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_color")
    private Long idTipoColor;

    @Column(name = "nombre")
    private String nombre;
}
