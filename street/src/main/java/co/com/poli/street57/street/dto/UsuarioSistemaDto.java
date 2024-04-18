package co.com.poli.street57.street.dto;

import co.com.poli.street57.street.enums.TipoPerfil;
import lombok.Data;

@Data
public class UsuarioSistemaDto {

    private Long documentoIdentidad;

    private String nombres;

    private String primerApellido;

    private String segundoApellido;

    private String email;

    private String clave;

    private String celular;

    private String direccion;

    private TipoPerfil tipoPerfil;
}
