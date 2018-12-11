package com.fyle.bankdetails;

import org.springframework.data.jpa.repository.JpaRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<BankResponse, String> {

	Iterable<BankResponse> findByNameAndCity(String string, String string2);

}
