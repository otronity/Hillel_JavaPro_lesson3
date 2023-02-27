package com.org.hibernate2.repository;

import com.org.hibernate2.model.Address;
import com.org.hibernate2.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

//    Address getAddressesBy(Client client);
}
