package com.Plantita.Plantita_BackEnd.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Plantita.Plantita_BackEnd.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    List<Usuario> findByNombreUsuario(String nombreUsuario); 

    Optional<Usuario> findByCorreoUsuario(String correoUsuario); // En este caso, usamos "Optional", ya que el correo es unico, y tambien esta la posibilidad de que no exista
    
    List<Usuario> findByRol_idRol(Integer idRol);

    
}
