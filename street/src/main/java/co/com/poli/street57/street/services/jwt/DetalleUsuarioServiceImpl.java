package co.com.poli.street57.street.services.jwt;

import co.com.poli.street57.street.entity.UsuarioSistemaEntity;
import co.com.poli.street57.street.repository.UsuarioSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetalleUsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioSistemaRepository usuarioSistemaRepository;
    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Optional<UsuarioSistemaEntity> optionalUsuarioSistema = usuarioSistemaRepository.findFirstByEmail(nombre);
        if(optionalUsuarioSistema.isEmpty()) throw  new UsernameNotFoundException("Usuario no encontrado", null);
        return  new org.springframework.security.core.userdetails.User(optionalUsuarioSistema.get().getEmail(),
                optionalUsuarioSistema.get().getClave(),
                new ArrayList<>());
    }
}
