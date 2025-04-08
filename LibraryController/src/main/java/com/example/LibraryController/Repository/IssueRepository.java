package com.example.LibraryController.Repository;


import com.example.LibraryController.Model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
