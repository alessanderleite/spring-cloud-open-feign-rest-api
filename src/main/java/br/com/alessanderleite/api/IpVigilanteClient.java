package br.com.alessanderleite.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alessanderleite.model.Location;

@FeignClient(name = "IpVigilanteClient", url = "https://ipvigilante.com/")
public interface IpVigilanteClient {
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	Location getLocation();
}