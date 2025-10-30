package com.Tuki.Tuki_Backend_Provisional.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categoria extends Base{
    @Builder.Default
    private Set<Producto> productos = new HashSet<>();


    @OneToMany
    @JoinColumn(name= "categoria")
    public void agregrarProducto(Producto p){
        productos.add(p);
    }

    public void eliminarTodosLosProductos(){
        for (Producto p: productos){
            p.setEliminado(true);
        }
    }
}
