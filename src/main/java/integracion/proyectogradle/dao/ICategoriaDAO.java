package integracion.proyectogradle.dao;

import integracion.proyectogradle.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaDAO extends JpaRepository<Categoria,Long> {
}
