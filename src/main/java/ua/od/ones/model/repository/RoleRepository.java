package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.Role;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {
    Optional<Role> findById(Long id);

    Optional<Role> findByName(String name);

    List<Role> findAll();
}
