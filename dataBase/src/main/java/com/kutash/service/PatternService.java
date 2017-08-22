package com.kutash.service;

import com.kutash.entity.EnglishPattern;
import com.kutash.repository.PatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatternService {

    @Autowired
    private PatternRepository patternRepository;

    @Transactional
    public List<EnglishPattern> getEnglishPatterns(){
        return patternRepository.findAll();
    }
}
