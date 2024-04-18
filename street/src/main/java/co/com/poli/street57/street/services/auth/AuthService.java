package co.com.poli.street57.street.services.auth;

import co.com.poli.street57.street.dto.SignupRequest;
import co.com.poli.street57.street.dto.UsuarioSistemaDto;

public interface AuthService {

    UsuarioSistemaDto crearUsuario(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
