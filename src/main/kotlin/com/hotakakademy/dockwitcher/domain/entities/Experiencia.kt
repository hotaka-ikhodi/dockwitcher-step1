package com.hotakakademy.dockwitcher.domain.entities

class Experiencia : ValueObject(){

    val especificaciones: List<String> = mutableListOf()
    val certificaciones: List<String> = mutableListOf()
    val categorias: List<Categoria> = mutableListOf()
}
