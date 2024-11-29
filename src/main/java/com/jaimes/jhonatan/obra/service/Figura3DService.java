package com.jaimes.jhonatan.obra.service;

import com.jaimes.jhonatan.obra.models.Figura3D;
import com.jaimes.jhonatan.obra.service.implement.Figura3DImplement;

import java.util.List;

public interface Figura3DService {
    
    Figura3D crearFigura3d(Figura3D figura);
    Figura3D obtenerFigura3d(Integer id);
    List<Figura3D> obtenerTodas();
    void borrarFigura3d(Integer id);
    Figura3D actualizarFiigura(Integer id, Figura3D figura);

}
