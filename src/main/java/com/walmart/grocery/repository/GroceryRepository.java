package com.walmart.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.walmart.grocery.model.Gorder;
import com.walmart.grocery.model.OrderInfo;
import com.walmart.grocery.model.TSOrder;
@RepositoryRestResource(collectionResourceRel="order", path = "order")
public interface GroceryRepository extends MongoRepository<Gorder, String> {
	//Get Document by Order Number
	List<Gorder> findByTSOrder_OrderInfo_OrderNumber_AllIgnoreCase(@Param("OrderNumber") String OrderNumber);

}
