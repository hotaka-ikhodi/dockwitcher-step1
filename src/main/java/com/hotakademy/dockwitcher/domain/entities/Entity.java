package com.hotakademy.dockwitcher.domain.entities;

import com.hotakademy.dockwitcher.domain.repositories.IMongoRepository;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

public abstract class Entity<T extends IMongoRepository> implements IModel {

    public void setRepository(T repository) {
        this.repository = repository;
    }

    @Transient
    protected T repository;

    @Id
    protected ObjectId id;

    @Field("created_at")
    private Date createdAt;

    @Field("updated_at")
    private Date updatedAt;

    private boolean activo;


    public Entity() {
        id = ObjectId.get();
        createdAt = new Date();
        updatedAt = new Date();
        activo = true;
    }

    @Override
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void save(){
        updatedAt = new Date();
        repository.save(this);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
