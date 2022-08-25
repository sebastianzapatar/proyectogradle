package integracion.proyectogradle.controlador;


import integracion.proyectogradle.entity.Producto;
import integracion.proyectogradle.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @GetMapping("/")
    public List<Producto> productos(){
        return productoService.findAll();
    }
    @GetMapping("/{id}")
    public Producto producto(@PathVariable Integer id){
        return productoService.findById(id);
    }
    @PostMapping("/insert")
    public Producto producto(@RequestBody Producto p){
        return productoService.save(p);
    }

}
