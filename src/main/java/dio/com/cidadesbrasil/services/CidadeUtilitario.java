package dio.com.cidadesbrasil.services;

import dio.com.cidadesbrasil.entities.Cidade;
import dio.com.cidadesbrasil.repositories.CidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class CidadeUtilitario {

    private final CidadeRepository cidadeRepository;

    public Double distanceByCubeInMeters(Cidade origem, Cidade destino) {

        Point p1 = getGeolocation(origem.getLatitude().toString(), origem.getLongitude().toString());
        Point p2 = getGeolocation(destino.getLatitude().toString(), destino.getLongitude().toString());

        return cidadeRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    private Point getGeolocation(String lat, String lon) {
        return new Point(Double.parseDouble(lat), Double.parseDouble(lon));
    }

}
