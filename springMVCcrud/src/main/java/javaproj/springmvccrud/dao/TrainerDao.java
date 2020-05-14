package javaproj.springmvccrud.dao;

import java.util.List;

import javaproj.springmvccrud.model.Trainer;

public interface TrainerDao {

	Trainer findById(int id);

	void saveTrainer(Trainer trainer);
	
	public void saveOrUpdate(Trainer trainer);
	
	void deleteTrainerById(int id);
	
	List<Trainer> findAllTrainers();

	Trainer findTrainerById(int id);

}
