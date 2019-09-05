package br.com.alessanderleite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.api.IpVigilanteClient;
import br.com.alessanderleite.model.Location;

@RestController
@RequestMapping("/api/v1")
public class LocationController {

	@Autowired
	private IpVigilanteClient ipVigilanteClient;
	
	@GetMapping()
	public Location getLocation() {
		return ipVigilanteClient.getLocation();
	}
}
