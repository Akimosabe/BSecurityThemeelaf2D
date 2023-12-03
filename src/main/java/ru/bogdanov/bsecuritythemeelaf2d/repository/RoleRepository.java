package ru.bogdanov.bsecuritythemeelaf2d.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.bogdanov.bsecuritythemeelaf2d.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}