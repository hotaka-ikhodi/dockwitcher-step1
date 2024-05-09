package com.hotakademy.dockwitcher.domain.repositories;


import com.hotakademy.dockwitcher.domain.entities.Entity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Optional;

public class AbstractMongoRepository<TEntity extends Entity> implements IMongoRepository<TEntity> {

    protected MongoTemplate mongoTemplate;
    protected Class<TEntity> entityClass;

    public AbstractMongoRepository(MongoTemplate mongoTemplate, Class<TEntity> entityClass) {
        this.mongoTemplate = mongoTemplate;
        this.entityClass = entityClass;
    }

    @Override
    public void save(TEntity entity){
        mongoTemplate.save(entity);
    }

    @Override
    public Optional<TEntity> findById(ObjectId objectId){
        return Optional.ofNullable(mongoTemplate.findById(objectId, entityClass));
    }

    @Override
    public boolean existsById(ObjectId id){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        return mongoTemplate.exists(query, entityClass);
    }
}
