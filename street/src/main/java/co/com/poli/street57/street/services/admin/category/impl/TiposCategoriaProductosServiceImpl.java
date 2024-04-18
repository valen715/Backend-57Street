package co.com.poli.street57.street.services.admin.category.impl;

import co.com.poli.street57.street.dto.TiposCategoriaProductosDto;
import co.com.poli.street57.street.entity.TiposCategoriaProductosEntity;
import co.com.poli.street57.street.repository.TiposCategoriaProductosRepository;
import co.com.poli.street57.street.services.admin.category.TiposCategoriaProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TiposCategoriaProductosServiceImpl implements TiposCategoriaProductosService {

    private final TiposCategoriaProductosRepository tiposCategoriaProductosRepository;

    public TiposCategoriaProductosEntity createcategoria(TiposCategoriaProductosDto tiposCategoriaProductosDto){
        TiposCategoriaProductosEntity categoria = new TiposCategoriaProductosEntity();
        categoria.setNombre(tiposCategoriaProductosDto.getNombre());

        return tiposCategoriaProductosRepository.save(categoria);
    }
}
