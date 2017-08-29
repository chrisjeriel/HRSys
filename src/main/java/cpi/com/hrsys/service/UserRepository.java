package cpi.com.hrsys.service;
import org.springframework.data.repository.CrudRepository;

import cpi.com.hrsys.entity.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {}
