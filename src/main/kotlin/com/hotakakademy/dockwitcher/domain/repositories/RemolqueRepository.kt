package com.hotakakademy.dockwitcher.domain.repositories

import com.hotakademy.dockwitcher.domain.repositories.AbstractMongoRepository
import com.hotakakademy.dockwitcher.domain.entities.Remolque
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate

class RemolqueRepository(
        @Qualifier("mongoMasterTemplate")
        mongoTemplate: MongoTemplate)
    : AbstractMongoRepository<Remolque>(mongoTemplate, Remolque::class.java), IRemolqueRepository {
}