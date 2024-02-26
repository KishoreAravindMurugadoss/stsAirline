package com.airlines_app002.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines_app002.entity.Passenger;
import com.airlines_app002.repository.PassengerRepository;

@RestController
@RequestMapping("/api")
public class PassengerRestContoller {

	@Autowired
	private PassengerRepository passengerRepo;
	
	//	http://localhost:8080/api/listallapi
	@GetMapping("/listallapi")
	public List<Passenger> listallApi(){
		List<Passenger> pass = passengerRepo.findAll();
		return pass;
	}
	//	http://localhost:8080/api/saveapi
	@PostMapping("/saveapi")
	public void saveApi(@RequestBody Passenger pass) {
		passengerRepo.save(pass);
	}
	//	http://localhost:8080/api/updateapi
	@PutMapping("/updateapi")
	public void updateApi(@RequestBody Passenger pass) {
		passengerRepo.save(pass);
	}
	//	http://localhost:8080/api/deleteapi/27
	@DeleteMapping("/deleteapi/{id}")
	public void deleteApi(@PathVariable("id") long id) {
		passengerRepo.deleteById(id);
	}
}
