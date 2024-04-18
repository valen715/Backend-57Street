package co.com.poli.street57.street.entity;

import co.com.poli.street57.street.enums.TipoPerfil;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios_sistema")
public class UsuarioSistemaEntity {

    @Id
    @Column(name = "documento_identidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentoIdentidad;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "p_apellido")
    private String primerApellido;

    @Column(name = "s_apellido")
    private String segundoApellido;

    @Column(name = "email")
    private String email;

    @Column(name = "clave")
    private String clave;

    @Column(name = "celular")
    private String celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "tipo_perfil")
    private TipoPerfil tipoPerfil;

}
