package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakademy.dockwitcher.domain.repositories.IMongoRepository
import com.hotakakademy.dockwitcher.domain.entities.Tractora

interface ITractoraRepository : IMongoRepository<Tractora> {
    fun findAll(): List<Tractora>
}