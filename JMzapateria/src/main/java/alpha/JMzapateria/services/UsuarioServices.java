package alpha.JMzapateria.services;

import alpha.JMzapateria.model.Usuario;

public interface UsuarioServices {
    Usuario mewUsuario (Usuario newUsuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario (Usuario usuario);
    Boolean deleteUsuario (Long iduser);

}
/*server.port=8081*/