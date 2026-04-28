package cl.duoc.repuestos.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.repuestos.dto.ApiResponse;
import cl.duoc.repuestos.dto.RepuestosDTO;
import cl.duoc.repuestos.model.Repuestos;
import cl.duoc.repuestos.service.RepuestosService;

@RestController
@RequestMapping("/api/v1/repuestos")
public class RepuestosConntroller {

    private final RepuestosService repuestosService;

    public RepuestosConntroller(RepuestosService repuestosService) {
        this.repuestosService = repuestosService;
    }

    @PostMapping
    public ResponseEntity<Repuestos> registrarRepuestos(@RequestBody Repuestos repuestos) {
        return ResponseEntity.ok(repuestosService.registraRepuestos(repuestos.getNombre(),repuestos.getFamilia(),repuestos.getComponentes(), repuestos.getStock()));
    }

    @PutMapping()
    public ResponseEntity<Repuestos> actualizarRepuestos(@RequestBody Repuestos repuestos) {
        return ResponseEntity.ok(repuestosService.registraRepuestos(repuestos.getNombre(),repuestos.getFamilia(),repuestos.getComponentes(), repuestos.getStock()));
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponse<List<RepuestosDTO>>> getAllRepuestos(){
        List<RepuestosDTO> repuestos = repuestosService.getAllRepuestosDTO();
        ApiResponse<List<RepuestosDTO>> response =
                new ApiResponse<>(200, "Listado de repuestos", repuestos);
        return ResponseEntity.ok(response);
    }
    
    
}
