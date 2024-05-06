package com.hotakakademy.dockwitcher.domain.entities

import java.util.Date

class Mantenimiento : ValueObject() {
    var fecha: Date = Date()
    var usuario: String = ""
    var acciones: String? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as Mantenimiento

        if (fecha != other.fecha) return false
        if (usuario != other.usuario) return false
        if (acciones != other.acciones) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + fecha.hashCode()
        result = 31 * result + usuario.hashCode()
        result = 31 * result + (acciones?.hashCode() ?: 0)
        return result
    }


}
