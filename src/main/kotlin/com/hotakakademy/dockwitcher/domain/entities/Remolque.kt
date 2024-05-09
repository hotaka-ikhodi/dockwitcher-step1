package com.hotakakademy.dockwitcher.domain.entities

import com.hotakademy.dockwitcher.domain.entities.Entity
import com.hotakakademy.dockwitcher.domain.repositories.IRemolqueRepository

class Remolque : Entity<IRemolqueRepository>() {
    var huecos: Int = 0
    var tipoMercancia: String? = null
    var grupoFrio: Boolean = false
}