package com.aream.matriapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aream.matriapp.models.Users;

public interface UserDetailRepository extends MongoRepository<Users, String>
{
	Users findBy_id(ObjectId _id);
}
