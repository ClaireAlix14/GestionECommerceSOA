package fr.insa.clientManagementMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRessource {

		@GetMapping("/clients")
		public int clientsNumber() {
			return 200;
		}
}
