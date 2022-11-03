package com.dantas.algafood.api.controller;

import com.dantas.algafood.entity.Estado;
import com.dantas.algafood.service.EstadoService;
import com.dantas.algafood.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/estados")
public class EstadoController extends GenericController<Estado>{

    public EstadoController(GenericService<Estado> service) {
        super(service);
    }
}
