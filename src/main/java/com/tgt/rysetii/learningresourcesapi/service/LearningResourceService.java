package com.tgt.rysetii.learningresourcesapi.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.tgt.rysetii.learningresourcesapi.repository.LearningResourceRepository;

@Service
public class LearningResourceService {
	
	@Autowired
	LearningResourceRepository lr;
	public void saveLearningResources(List<LearningResource> learningResources){
        for (LearningResource learningResource : learningResources)
            lr.save(learningResource);
    }

    public List<LearningResource> getLearningResources(){
        return lr.findAll();
    }

    public List<Double> getProfitMargin(){
        List<LearningResource> learningResources = getLearningResources();

        List<Double> profitMargins = learningResources.stream()
                                            .map(lr -> ((lr.getSellingPrice() - lr.getCostPrice())/lr.getSellingPrice()))
                                            .collect(Collectors.toList());

        return profitMargins;
    }

    public List<LearningResource> sortLearningResourcesByProfitMargin(){
        List<LearningResource> learningResources = getLearningResources();

        learningResources.sort((lr1, lr2) -> {
            Double profitMargin1 = (lr1.getSellingPrice() - lr1.getCostPrice())/lr1.getSellingPrice();
            Double profitMargin2 = (lr2.getSellingPrice() - lr2.getCostPrice())/lr2.getSellingPrice();
            return profitMargin2.compareTo(profitMargin1) ;
        });
        return learningResources;
    }
    
    public void deleteLearningResourcesById(int id)
    {
    	this.lr.deleteById(id);
    }
	
}
