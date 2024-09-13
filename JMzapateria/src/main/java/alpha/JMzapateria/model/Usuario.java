package alpha.JMzapateria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    @Column (name = "Id usuario")
    private Long iduser; 
    
    @Column (name = "Nombres", nullable = false, length = 20)
    private String nomuser; 

    @Column (name = "Password", nullable = false)
    private String password;

    @Column (name = "Email", unique=true, nullable = false)
    private String email;
    
    @Column (name = "Telefono", nullable = false)
    private String telefono;
}

