package dio.com.cidadesbrasil.services;

import dio.com.cidadesbrasil.entities.Estado;
import dio.com.cidadesbrasil.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) { this.estadoRepository = estadoRepository;}

    public List<Estado> findAll(){
        return estadoRepository.findAll();
    }
}


