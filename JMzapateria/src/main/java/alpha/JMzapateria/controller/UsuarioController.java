package alpha.JMzapateria.controller;

import alpha.JMzapateria.model.Usuario;
import alpha.JMzapateria.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioServices usuarioServices;
    
    @PostMapping("/nuevo")
    public Usuario newUsuario(@RequestBody Usuario newUsuario){
        return this.usuarioServices.mewUsuario(newUsuario);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioServices.getAll();
    }
    @PostMapping("/modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioServices.modifyUsuario(usuario);
    }
    @PostMapping (value="/id")
    public Boolean deleteUsuario(@PathVariable(value="id") Long id){
    return this.usuarioServices.deleteUsuario(id);
    }
}
