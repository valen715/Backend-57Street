package co.com.poli.street57.street.services.auth.impl;

import co.com.poli.street57.street.dto.SignupRequest;
import co.com.poli.street57.street.dto.UsuarioSistemaDto;
import co.com.poli.street57.street.entity.UsuarioSistemaEntity;
import co.com.poli.street57.street.enums.TipoPerfil;
import co.com.poli.street57.street.repository.UsuarioSistemaRepository;
import co.com.poli.street57.street.services.auth.AuthService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UsuarioSistemaRepository usuarioSistemaRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public UsuarioSistemaDto crearUsuario(SignupRequest signupRequest){
        UsuarioSistemaEntity usuarioSistema = new UsuarioSistemaEntity();

        usuarioSistema.setEmail(signupRequest.getEmail());
        usuarioSistema.setClave(new BCryptPasswordEncoder().encode(signupRequest.getClave()));
        usuarioSistema.setNombres(signupRequest.getNombres());
        usuarioSistema.setPrimerApellido(signupRequest.getPrimerApellido());
        usuarioSistema.setSegundoApellido(signupRequest.getSegundoApellido());
        usuarioSistema.setCelular(signupRequest.getCelular());
        usuarioSistema.setDireccion(signupRequest.getDireccion());
        usuarioSistema.setTipoPerfil(TipoPerfil.CLIENTE);
        UsuarioSistemaEntity crearUsuario = usuarioSistemaRepository.save(usuarioSistema);

        UsuarioSistemaDto usuarioSistemaDto = new UsuarioSistemaDto();
        usuarioSistemaDto.setDocumentoIdentidad(crearUsuario.getDocumentoIdentidad());

        return usuarioSistemaDto;
    }

    public Boolean hasUserWithEmail(String email){
        return  usuarioSistemaRepository.findFirstByEmail(email).isPresent();
    }

    @PostConstruct
    public void crearAdministrador(){
        UsuarioSistemaEntity cuentaAmdin = usuarioSistemaRepository.findByTipoPerfil(TipoPerfil.ADMINISTRADOR);
        if(null == cuentaAmdin){
            UsuarioSistemaEntity usuarioSistema = new UsuarioSistemaEntity();
            usuarioSistema.setEmail("admin@test.com");
            usuarioSistema.setClave(new BCryptPasswordEncoder().encode("admin"));
            usuarioSistema.setTipoPerfil(TipoPerfil.ADMINISTRADOR);
            usuarioSistemaRepository.save(usuarioSistema);
        }
    }
}
