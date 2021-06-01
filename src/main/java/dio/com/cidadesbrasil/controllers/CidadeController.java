package dio.com.cidadesbrasil.controllers;

import dio.com.cidadesbrasil.entities.Cidade;
import dio.com.cidadesbrasil.services.CidadeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {
    private final CidadeService cidadeServices;

    public CidadeController(CidadeService cidadeServices) {
        this.cidadeServices = cidadeServices;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cidade> findAll(){
        return cidadeServices.findAll();
    }

    @GetMapping("/distancia/{origemId}/{destinoId}")
    public ResponseEntity<Double> distanciaEntreCidades(@PathVariable Long origemId, @PathVariable Long destinoId){

        Double distancia = cidadeServices.distanciaEntreCidades(origemId, destinoId);

        return ResponseEntity.ok().body(distancia);
    }
}
