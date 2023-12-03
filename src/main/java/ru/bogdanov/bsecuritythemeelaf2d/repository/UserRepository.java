package ru.bogdanov.bsecuritythemeelaf2d.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.bogdanov.bsecuritythemeelaf2d.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}