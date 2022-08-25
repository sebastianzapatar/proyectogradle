package integracion.proyectogradle.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class ProductosCompraPK implements Serializable {
    @Column(name = "producto_id")
    private Long productoId;
    @Column(name = "compra_id")
    private Long compraId;

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
    }
}
