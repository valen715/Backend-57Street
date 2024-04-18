package co.com.poli.street57.street.controller.admin;

import co.com.poli.street57.street.dto.TiposCategoriaProductosDto;
import co.com.poli.street57.street.entity.TiposCategoriaProductosEntity;
import co.com.poli.street57.street.services.admin.category.TiposCategoriaProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminCategoriaController {

    private final TiposCategoriaProductosService tiposCategoriaProductosService;

    @PostMapping("categoria")
    public ResponseEntity<TiposCategoriaProductosEntity> createCategoria(@Validated @RequestBody TiposCategoriaProductosDto tiposCategoriaProductosDto){
        TiposCategoriaProductosEntity categoria = tiposCategoriaProductosService.createcategoria(tiposCategoriaProductosDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }
}
