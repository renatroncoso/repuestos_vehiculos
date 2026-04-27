package cl.duoc.repuestos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "repuestos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Repuestos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vin;

    @Column(nullable = false)
    private String familia;

    @Column(nullable = false)
    private String componentes;
    
    @Column(nullable = false, unique = true)
    private String nombre;
}
