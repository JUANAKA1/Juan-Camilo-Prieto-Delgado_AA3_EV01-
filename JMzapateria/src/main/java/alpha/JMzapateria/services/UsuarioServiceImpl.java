package alpha.JMzapateria.services;

import alpha.JMzapateria.model.Usuario;
import alpha.JMzapateria.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioServices {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario mewUsuario(Usuario newUsuario) {
            return usuarioRepository.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
            return this.usuarioRepository.findAll();  
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado= this.usuarioRepository.findById(usuario.getIduser());
        if(usuarioEncontrado.get()!=null){
                usuarioEncontrado.get().setEmail(usuario.getEmail());
            usuarioEncontrado.get().setNomuser(usuario.getNomuser());
            usuarioEncontrado.get().setPassword(usuario.getPassword());
            usuarioEncontrado.get().setTelefono(usuario.getTelefono());
            return this.mewUsuario(usuarioEncontrado.get());
    }
            return null; 
    }


    @Override
    public Boolean deleteUsuario(Long iduser ) {
            this.usuarioRepository.deleteById(iduser); 
            return true;
    }
}