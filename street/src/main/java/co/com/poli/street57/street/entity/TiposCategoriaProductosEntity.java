package co.com.poli.street57.street.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipos_categoria_productos")
public class TiposCategoriaProductosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_categoria_producto")
    private Long idTipoCategoriaProducto;

    @Column(name = "nombre")
    private String nombre;
}
