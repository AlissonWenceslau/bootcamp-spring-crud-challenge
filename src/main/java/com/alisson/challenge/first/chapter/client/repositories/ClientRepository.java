package com.alisson.challenge.first.chapter.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisson.challenge.first.chapter.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
