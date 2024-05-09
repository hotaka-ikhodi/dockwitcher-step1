package com.hotakademy.dockwitcher.domain.repositories;

import com.hotakademy.dockwitcher.domain.entities.Entity;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface IMongoRepository<TEntity extends Entity> {
    void save(TEntity entity);

    Optional<TEntity> findById(ObjectId objectId);

    boolean existsById(ObjectId id);
}