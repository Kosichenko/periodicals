package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.ones.model.entity.Localization;
import ua.od.ones.model.entity.Theme;

import java.util.List;
import java.util.Optional;

public interface LocalizationRepository extends JpaRepository <Localization, Long> {
    Optional<Localization> findById(Long id);

    Optional<Localization> findByName(String name);

    List<Localization> findAll();
}