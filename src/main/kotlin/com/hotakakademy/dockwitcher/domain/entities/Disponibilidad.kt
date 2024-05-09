package com.hotakakademy.dockwitcher.domain.entities

class Disponibilidad : ValueObject(){
    val preferencias: List<String> = mutableListOf()
    var turnos: String? = null
    var findesemana: Boolean = false
}
