package com.jaimes.jhonatan.obra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jaimes.jhonatan.obra.models.Figura3D;
import com.jaimes.jhonatan.obra.service.Figura3DService;

import java.util.List;

@RestController
@RequestMapping("/figura")
public class FiguraController {

    private final Figura3DService figura3DService;

    @Autowired
    public FiguraController(Figura3DService figura3DService) {
        this.figura3DService = figura3DService;

    }

    @PostMapping("/crear")
    public String figuraController(@RequestBody Figura3D figura) {
        figura3DService.crearFigura3d(figura);
        return "bien";
    }

    @GetMapping("/buscar/{id}")
    public Figura3D obtenerController(@PathVariable int id){
        return figura3DService.obtenerFigura3d(id);
    }

    @GetMapping("/todas")
    public List<Figura3D> obtenerTodasController(){
        return figura3DService.obtenerTodas();
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarControler(@PathVariable int id){
        figura3DService.borrarFigura3d(id);
        return "Dato borrado";
    }

    @PutMapping("/actualizar/{id}")
    public String actualizarControlador(@PathVariable int id, @RequestBody Figura3D figura){
        figura3DService.actualizarFiigura(id, figura);
        return "Figura actualizada";
    }

}
