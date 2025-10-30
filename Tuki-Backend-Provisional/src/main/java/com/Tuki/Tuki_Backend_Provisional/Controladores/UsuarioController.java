package com.Tuki.Tuki_Backend_Provisional.Controladores;

import com.Tuki.Tuki_Backend_Provisional.Entidades.Categoria;
import com.Tuki.Tuki_Backend_Provisional.Entidades.DTOs.UsuarioPostDTO;
import com.Tuki.Tuki_Backend_Provisional.Entidades.Usuario;
import com.Tuki.Tuki_Backend_Provisional.Mappers.UsuarioMapper;
import com.Tuki.Tuki_Backend_Provisional.Repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioMapper mapper;

    @Autowired
    private UsuarioRepository repo;

    @GetMapping
    public List<Usuario> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody UsuarioPostDTO dto){
        Usuario usuario = mapper.toEntity(dto);
        return repo.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return repo.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
        //buscamos elementos por id
//        Categoria categoria = new Categoria();
//        categoria.setEliminado(false);
//        categoria.eliminarTodosLosProductos();
    }

}
