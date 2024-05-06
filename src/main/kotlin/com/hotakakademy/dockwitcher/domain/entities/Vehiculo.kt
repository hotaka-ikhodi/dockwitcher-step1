package com.hotakakademy.dockwitcher.domain.entities

class Vehiculo : Entity() {
    var historial : List<Mantenimiento> = mutableListOf()
    var matricula: String = ""
    var estado: VehiculoEstado = VehiculoEstado.ACTIVO
    var modelo: Modelo = Modelo()
    var caracteristicas: CaracteristicasFisicas = CaracteristicasFisicas()
}