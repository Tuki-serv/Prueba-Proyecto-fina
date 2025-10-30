package com.Tuki.Tuki_Backend_Provisional.Entidades;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Producto extends Base{

    private Categoria categoria;


    public void agregarProducto(){
        categoria.agregrarProducto(this);
    }
}
