package com.rating.client.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.client.domain.Client;
import com.rating.client.domain.Profile;
import com.rating.client.persistance.IClientRepository;
import com.rating.client.persistance.IProfileRepository;


@RestController
@RequestMapping("/client")
public class ClientController {


	
	@Autowired
	private IClientRepository clientRepo;
	
	@Autowired
	private IProfileRepository profileRepo;
	
	@GetMapping("/all")
	public List<Client> getAll(){
		
		return clientRepo.findAll();
	}
	
	
	@PostMapping("/create")
	public void create(@RequestBody Client client) {
		System.out.println(client);
		clientRepo.save(client);
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		clientRepo.deleteById(id);
	}
	
	@GetMapping("/profiles")
	List<Profile> getListProfiles(){
		return profileRepo.findAll();
	}
}
