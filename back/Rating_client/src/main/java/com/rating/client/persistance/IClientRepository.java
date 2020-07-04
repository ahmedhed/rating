package com.rating.client.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.client.domain.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long>{

}
