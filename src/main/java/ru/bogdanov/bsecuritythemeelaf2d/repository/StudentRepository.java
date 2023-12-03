package ru.bogdanov.bsecuritythemeelaf2d.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bogdanov.bsecuritythemeelaf2d.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}