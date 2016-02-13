package com.walmart.grocery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.walmart.grocery.model.Gorder;
import com.walmart.grocery.model.TSOrder;
@RepositoryRestResource(collectionResourceRel="order", path = "order")
public interface GroceryRepository extends MongoRepository<Gorder, String> {

}
