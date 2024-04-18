package co.com.poli.street57.street.repository;

import co.com.poli.street57.street.entity.UsuarioSistemaEntity;
import co.com.poli.street57.street.enums.TipoPerfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioSistemaRepository extends JpaRepository<UsuarioSistemaEntity, Long> {

    Optional<UsuarioSistemaEntity> findFirstByEmail(String email);

    UsuarioSistemaEntity findByTipoPerfil(TipoPerfil tipoPerfil);
}
