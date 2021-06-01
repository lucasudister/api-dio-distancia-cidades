package dio.com.cidadesbrasil.controllers;

import dio.com.cidadesbrasil.entities.Estado;
import dio.com.cidadesbrasil.services.EstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    private final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Estado> findAll(){
        return estadoService.findAll();
    }
}
