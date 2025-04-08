package com.example.LibraryController.Repository;




import com.example.LibraryController.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

