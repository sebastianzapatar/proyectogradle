package integracion.proyectogradle.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compras_productos")
public class ProductosCompras {
    @EmbeddedId
    private ProductosCompraPK id;
}
