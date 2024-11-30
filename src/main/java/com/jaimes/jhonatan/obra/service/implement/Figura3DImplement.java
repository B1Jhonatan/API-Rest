package com.jaimes.jhonatan.obra.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimes.jhonatan.obra.models.Figura3D;
import com.jaimes.jhonatan.obra.repository.Figura3DRepository;
import com.jaimes.jhonatan.obra.service.Figura3DService;

import java.util.List;

@Service
public class Figura3DImplement implements Figura3DService{

    private final Figura3DRepository figura3dRepository;

    @Autowired
    public Figura3DImplement(Figura3DRepository figura3DRepository){
        this.figura3dRepository = figura3DRepository;
    }

    @Override
    public Figura3D crearFigura3d(Figura3D figura) {
        return figura3dRepository.save(figura);
    }

    @Override
    public Figura3D obtenerFigura3d(Integer id) {
        return figura3dRepository.findById(id).orElse(null);
    }

    @Override
    public List<Figura3D> obtenerTodas() {
        return figura3dRepository.findAll();
    }

    @Override
    public void borrarFigura3d(Integer id) {
        figura3dRepository.deleteById(id);
    }

    @Override
    public Figura3D actualizarFiigura(Integer id, Figura3D figura) {

        Figura3D elementoDB = figura3dRepository.findById(id).orElse(null);

        if (elementoDB != null) {
            elementoDB.setLargo(figura.getLargo());
            elementoDB.setAncho(figura.getAncho());
            elementoDB.setAlto(figura.getAlto());

            return figura3dRepository.save(elementoDB);
        }

        return null;
    }


}
