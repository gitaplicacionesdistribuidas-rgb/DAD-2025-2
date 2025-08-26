package Service;

import Entity.Factura;
import org.springframework.stereotype.Service;
import repository.FacturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<Factura> listarTodas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> obtenerPorId(Long id) {
        return facturaRepository.findById(id);
    }

    public Factura guardar(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void eliminar(Long id) {
        facturaRepository.deleteById(id);
    }
}