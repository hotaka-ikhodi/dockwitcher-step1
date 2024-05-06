package com.hotakakademy.dockwitcher.domain.entities

class Vehiculo : Entity() {
    lateinit var historial : List<Mantenimiento>
    var matricula: String = ""
    var estado: VehiculoEstado = VehiculoEstado.ACTIVO
    var modelo: Modelo = Modelo()
    var caracteristicas: CaracteristicasFisicas = CaracteristicasFisicas()
}