package co.com.poli.street57.street.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipos_tallas")
public class TiposTallasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_talla")
    private Long idTipoTalla;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;
}
