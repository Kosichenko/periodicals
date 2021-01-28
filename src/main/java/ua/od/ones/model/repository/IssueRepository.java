package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.Issue;

import java.util.List;
import java.util.Optional;

@Repository
public interface IssueRepository extends JpaRepository <Issue, Long> {
    Optional<Issue> findById(Long id);

    Optional<Issue> findByName(String name);

    List<Issue> findAll();
}
