package co.com.poli.street57.street.dto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class SignupRequest {

    private String nombres;

    private String primerApellido;

    private String segundoApellido;

    private String email;

    private String clave;

    private String celular;

    private String direccion;
}
