package integracion.proyectogradle.controlador;

import integracion.proyectogradle.entity.Categoria;
import integracion.proyectogradle.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControladorRest {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/categoria")
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }
    @GetMapping("/categoria/{id}")
    public Categoria findAll(@PathVariable Long id){
        return categoriaService.findById(id).orElse(null);
    }
}
