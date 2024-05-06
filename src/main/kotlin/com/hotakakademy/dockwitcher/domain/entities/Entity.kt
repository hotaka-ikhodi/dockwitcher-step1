package com.hotakakademy.dockwitcher.domain.entities

import org.bson.types.ObjectId
import java.util.*

open class Entity {
    var id: ObjectId = ObjectId()
    var createAt: Date = Date()
    var updateAt: Date = Date()
}