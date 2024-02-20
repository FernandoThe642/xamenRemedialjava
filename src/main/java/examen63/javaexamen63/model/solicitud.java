package examen63.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String cedulaCliente;
    
    @Column(nullable = false)
    private String nombreCliente;
    
    @Column(nullable = false)
    private String correoElectronico;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fecha;
    
    @Column(nullable = false)
    private Double monto;
    
    @Column(nullable = false)
    private Integer meses;
    

}
