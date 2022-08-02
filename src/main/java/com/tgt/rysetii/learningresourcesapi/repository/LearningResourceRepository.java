package com.tgt.rysetii.learningresourcesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgt.rysetii.learningresourcesapi.entity.LearningResource;

public interface LearningResourceRepository extends JpaRepository<LearningResource,Integer>  {

}
