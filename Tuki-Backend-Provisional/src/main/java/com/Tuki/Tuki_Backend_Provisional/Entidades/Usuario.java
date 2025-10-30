package com.Tuki.Tuki_Backend_Provisional.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Usuario extends Base {

    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    private String rol;
}
