package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakakademy.dockwitcher.domain.entities.Entity
import org.bson.types.ObjectId

interface IMongoRepository<TEntity : Entity> {
    fun save(entity: TEntity)
    fun findById(objectId: ObjectId?): TEntity?
    fun existsById(id: ObjectId?): Boolean
}