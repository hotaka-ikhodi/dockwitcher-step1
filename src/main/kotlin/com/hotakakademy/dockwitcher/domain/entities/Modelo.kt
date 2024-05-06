package com.hotakakademy.dockwitcher.domain.entities

class Modelo : ValueObject() {

    var anyoFabricacion: Int? = null
    var marca: String? = null
    var modelo: String? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as Modelo

        if (anyoFabricacion != other.anyoFabricacion) return false
        if (marca != other.marca) return false
        if (modelo != other.modelo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (anyoFabricacion ?: 0)
        result = 31 * result + (marca?.hashCode() ?: 0)
        result = 31 * result + (modelo?.hashCode() ?: 0)
        return result
    }


}
