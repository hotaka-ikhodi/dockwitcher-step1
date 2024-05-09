package com.hotakademy.dockwitcher.domain.entities;

import com.hotakademy.dockwitcher.domain.entities.Entity;
import com.hotakademy.dockwitcher.domain.repositories.IMongoRepository;
import com.hotakakademy.dockwitcher.domain.entities.CaracteristicasFisicas;
import com.hotakakademy.dockwitcher.domain.entities.Mantenimiento;
import com.hotakakademy.dockwitcher.domain.entities.Modelo;
import com.hotakakademy.dockwitcher.domain.entities.VehiculoEstado;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo<TRepo extends IMongoRepository> extends Entity<TRepo> {

    private List<Mantenimiento> historial;
    private String matricula;
    private VehiculoEstado estado = VehiculoEstado.ACTIVO;
    private Modelo modelo;
    private CaracteristicasFisicas caracteristicas;


    public Vehiculo() {
        this.historial = new ArrayList<>();
        this.modelo = new Modelo();
        this.caracteristicas = new CaracteristicasFisicas();
    }

    public List<Mantenimiento> getHistorial() {
        return historial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public VehiculoEstado getEstado() {
        return estado;
    }

    public void setEstado(VehiculoEstado estado) {
        this.estado = estado;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public CaracteristicasFisicas getCaracteristicas() {
        return caracteristicas;
    }
}
