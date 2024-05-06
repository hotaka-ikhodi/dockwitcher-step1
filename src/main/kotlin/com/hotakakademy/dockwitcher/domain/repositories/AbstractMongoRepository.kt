package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakakademy.dockwitcher.domain.entities.Entity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import java.util.*

open class AbstractMongoRepository<TEntity : Entity>(protected var mongoTemplate: MongoTemplate, protected var entityClass: Class<TEntity>) : IMongoRepository<TEntity> {
    override fun save(entity: TEntity) {
        mongoTemplate.save(entity)
    }

    override fun findById(objectId: ObjectId?): TEntity? {
        return mongoTemplate.findById(objectId!!, entityClass)
    }

    override fun existsById(id: ObjectId?): Boolean {
        val query = Query()
        query.addCriteria(Criteria.where("_id").`is`(id))
        return mongoTemplate.exists(query, entityClass)
    }
}