package com.hotakakademy.dockwitcher.domain.entities

class Experiencia : ValueObject(){
    var especificaciones: List<String> = mutableListOf()
    var certificaciones: List<String> = mutableListOf()
    var categorias: List<Categoria> = mutableListOf()
}
