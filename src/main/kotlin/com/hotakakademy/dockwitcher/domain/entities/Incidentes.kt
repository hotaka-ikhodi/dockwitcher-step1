package com.hotakakademy.dockwitcher.domain.entities

import java.util.Date

class Incidentes : ValueObject(){
    var fecha: Date = Date()
    var tipo: String? = null
    var observaciones: String? = null
}
