package cl.duoc.repuestos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RepuestosDTO {
    private Long vin;
    private String nombre;
}
