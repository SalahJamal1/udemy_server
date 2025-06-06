package com.app.udemy.course;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseImpService implements CourseService {
    private final CourseRepository repository;


    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void delete(Course entity) {
        repository.delete(entity);
    }


}
