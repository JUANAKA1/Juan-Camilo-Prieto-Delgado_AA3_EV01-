package alpha.JMzapateria.repository;

import alpha.JMzapateria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
