package Services;

import Entitys.DTOs.UsuarioDTO;
import Entitys.DTOs.UsuarioSesionDTO;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> listarTodos();
    UsuarioDTO busacarPorId(Long id);
    UsuarioSesionDTO guardar(UsuarioDTO dto);
    UsuarioDTO actualizar(Long id, UsuarioDTO dto);
    void eliminar(Long id);
}
