package com.hotakakademy.dockwitcher.domain.entities

class Disponibilidad : ValueObject(){
    var preferencias: List<String> = mutableListOf()
    var turnos: String? = null
    var findesemana: Boolean = false
}
