package com.fyle.bankdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bankdetails")
public class BankController {

	 @Autowired
		private UserRepository UserRepository;
	 @GetMapping("/detail/{ifsc}")
	 public ResponseEntity<BankResponse> getdetailsByIfsc( @PathVariable("ifsc") String ifsc) {
		 BankResponse response = UserRepository.findById(ifsc).orElseThrow(() -> new ResourceNotFoundException("Bankdetails", "IFSC code", ifsc));
		 return new ResponseEntity<BankResponse>(response, HttpStatus.OK);
	 }

	 @RequestMapping(path = "/bankdetails", method = RequestMethod.POST, consumes = "application/json")
	 public ResponseEntity<List<BankResponse>> getdetailsByName( @RequestBody BankRequest request) {
		 List<BankResponse> response = (List<BankResponse>) UserRepository.findByNameAndCity(request.getName(),request.getCity());
		 return new ResponseEntity<List<BankResponse>>(response, HttpStatus.OK);
	 }

}
