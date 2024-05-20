package com.hotakakademy.dockwitcher.domain.entities

import com.hotakademy.dockwitcher.domain.entities.Vehiculo
import com.hotakakademy.dockwitcher.domain.repositories.ITractoraRepository
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tractoras")
class Tractora : Vehiculo<ITractoraRepository>() {
    var conductor: Conductor? = null


}