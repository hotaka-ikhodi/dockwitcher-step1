package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakademy.dockwitcher.domain.repositories.AbstractMongoRepository
import com.hotakakademy.dockwitcher.domain.entities.Conductor
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate

class ConductorRepository(
        @Qualifier("mongoMasterTemplate")
        mongoTemplate: MongoTemplate)
    : AbstractMongoRepository<Conductor>(mongoTemplate, Conductor::class.java), IConductorRepository {
}