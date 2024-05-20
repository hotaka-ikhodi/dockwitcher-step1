package com.hotakakademy.dockwitcher.domain.entities

import com.hotakademy.dockwitcher.domain.entities.Vehiculo
import com.hotakakademy.dockwitcher.domain.repositories.IRemolqueRepository

class Remolque : Vehiculo<IRemolqueRepository>() {
    var huecos: Int = 0
    var tipoMercancia: String? = null
    var grupoFrio: Boolean = false
}