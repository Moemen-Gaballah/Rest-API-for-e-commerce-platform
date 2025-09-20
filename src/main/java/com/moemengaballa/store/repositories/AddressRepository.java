package com.moemengaballa.store.repositories;

import com.moemengaballa.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}