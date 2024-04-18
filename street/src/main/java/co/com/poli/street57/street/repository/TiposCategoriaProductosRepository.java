package co.com.poli.street57.street.repository;

import co.com.poli.street57.street.entity.TiposCategoriaProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposCategoriaProductosRepository extends JpaRepository<TiposCategoriaProductosEntity, Long> {

}
