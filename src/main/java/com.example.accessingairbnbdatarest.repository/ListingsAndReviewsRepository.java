package com.example.accessingairbnbdatarest.repository;

import com.example.accessingairbnbdatarest.domain.ListingsAndReviews;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "listingsAndReviews", path = "listingsAndReviews")
public interface ListingsAndReviewsRepository extends MongoRepository<ListingsAndReviews, String> {

    List<ListingsAndReviews> findByName(@Param("name") String name);

    ListingsAndReviews findById(ObjectId id);
}