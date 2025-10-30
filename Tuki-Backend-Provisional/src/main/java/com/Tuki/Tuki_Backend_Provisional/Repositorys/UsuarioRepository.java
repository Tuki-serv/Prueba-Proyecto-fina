package com.Tuki.Tuki_Backend_Provisional.Repositorys;

import com.Tuki.Tuki_Backend_Provisional.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
