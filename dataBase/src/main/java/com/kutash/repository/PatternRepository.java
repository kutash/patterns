package com.kutash.repository;

import com.kutash.entity.EnglishPattern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatternRepository extends JpaRepository<EnglishPattern, Long> {
}
