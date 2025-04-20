package br.com.minhas_calorias.repository;

import br.com.minhas_calorias.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {

}
