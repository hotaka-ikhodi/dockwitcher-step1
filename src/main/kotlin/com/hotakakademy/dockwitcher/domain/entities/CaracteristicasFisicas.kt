package com.hotakakademy.dockwitcher.domain.entities

class CaracteristicasFisicas : ValueObject() {
    val dimensiones: DimensionesVehiculo = DimensionesVehiculo()
    val carga: CargaVehiculo = CargaVehiculo()
}
