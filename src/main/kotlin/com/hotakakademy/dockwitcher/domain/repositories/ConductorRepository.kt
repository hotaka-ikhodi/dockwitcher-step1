package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakademy.dockwitcher.domain.repositories.AbstractMongoRepository
import com.hotakakademy.dockwitcher.domain.entities.Conductor
import com.hotakakademy.dockwitcher.domain.entities.Tractora
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository

@Repository
class ConductorRepository(
        @Qualifier("mongoMasterTemplate")
        mongoTemplate: MongoTemplate)
    : AbstractMongoRepository<Conductor>(mongoTemplate, Conductor::class.java), IConductorRepository {
    override fun findAll(): List<Conductor> {
        val list = mongoTemplate.findAll(Conductor::class.java)
        return list
    }
}