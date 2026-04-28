package cl.duoc.repuestos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.repuestos.dto.RepuestosDTO;
import cl.duoc.repuestos.model.Repuestos;
import cl.duoc.repuestos.repository.RepuestosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RepuestosService {
    private final RepuestosRepository repuestosRepository;

    public Repuestos registraRepuestos(String nombre,String familia,String componentes,int stock){
        if(repuestosRepository.findByNombre(nombre).isPresent()){
            Repuestos repuestos = repuestosRepository.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("not found"));
            repuestos.setStock(stock + repuestos.getStock());
            return repuestosRepository.save(repuestos);
        }
        Repuestos repuestos = new Repuestos(null,familia,componentes,nombre,stock);
        return repuestosRepository.save(repuestos);
    }

    public List<RepuestosDTO> getAllRepuestosDTO() {
        return repuestosRepository.findAll()
                .stream()
                .map(r -> new RepuestosDTO(r.getVin(),r.getNombre(),r.getStock()))
                .toList();
    }
}
