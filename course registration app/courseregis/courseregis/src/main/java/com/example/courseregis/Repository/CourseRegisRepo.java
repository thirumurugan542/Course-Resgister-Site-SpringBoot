package com.example.courseregis.Repository;

import com.example.courseregis.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisRepo extends JpaRepository<CourseRegistry,Integer> {
}
