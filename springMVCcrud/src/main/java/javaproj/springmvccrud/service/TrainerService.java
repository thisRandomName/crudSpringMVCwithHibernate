package javaproj.springmvccrud.service;

import java.util.List;

import javaproj.springmvccrud.model.Trainer;

public interface TrainerService {

	Trainer findById(int id);
	
	void saveTrainer(Trainer trainer);
	
	void updateTrainer(Trainer trainer);
	
	void deleteTrainerById(int id);

	List<Trainer> findAllTrainers(); 
	
	Trainer findTrainerById(int id);

	
	
}
