package com.alisson.challenge.first.chapter.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.alisson.challenge.first.chapter.client.dto.ClientDTO;
import com.alisson.challenge.first.chapter.client.entities.Client;
import com.alisson.challenge.first.chapter.client.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public Page<ClientDTO> findAll(PageRequest pageRequest){
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}
}
