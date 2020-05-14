package javaproj.springmvccrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javaproj.springmvccrud.dao.TrainerDao;
import javaproj.springmvccrud.model.Trainer;

@Service("trainerService")
@Transactional
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerDao dao;
	
	public Trainer findById(int id) {
		return dao.findById(id);
	}

	public void saveTrainer(Trainer trainer) {
		dao.saveTrainer(trainer);
	}
	
	public void updateTrainer(Trainer trainer) {
		Trainer entity = dao.findById(trainer.getId());
		if(entity!=null){
			entity.setFname(trainer.getFname());
			entity.setLname(trainer.getLname());
			entity.setSubject(trainer.getSubject());
			//dao.saveOrUpdate(student);
		}
	}

	public void deleteTrainerById(int id) {
		dao.deleteTrainerById(id);
	}
	
	public List<Trainer> findAllTrainers() {
		return dao.findAllTrainers();
	}

	public Trainer findTrainerById(int id) {
		return dao.findTrainerById(id);
	}

	
	
}
