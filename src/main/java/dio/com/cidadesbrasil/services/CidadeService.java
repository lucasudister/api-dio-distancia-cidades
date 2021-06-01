package dio.com.cidadesbrasil.services;

import dio.com.cidadesbrasil.entities.Cidade;
import dio.com.cidadesbrasil.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {
    private final CidadeRepository cidadeRepository;
    private final CidadeUtilitario cidadeUtilitario;

    @Autowired
    public CidadeService(CidadeRepository cidadeRepository, CidadeUtilitario cidadeUtilitario) {

        this.cidadeRepository = cidadeRepository;
        this.cidadeUtilitario = cidadeUtilitario;
    }

    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }

    @Transactional
    public Cidade findById(Long id){
        Optional<Cidade> estado = cidadeRepository.findById(id);
        return estado.get();
    }

    @Transactional
    public Double distanciaEntreCidades(Long origemId, Long destinoId) {
        Cidade origem = findById(origemId);
        Cidade destino = findById(destinoId);
        return cidadeUtilitario.distanceByCubeInMeters(origem, destino);
    }
}
