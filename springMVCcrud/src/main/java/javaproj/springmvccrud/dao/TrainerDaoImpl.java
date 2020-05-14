package javaproj.springmvccrud.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javaproj.springmvccrud.model.Trainer;

@Repository("trainerDao")
public class TrainerDaoImpl extends AbstractDao<Integer,Trainer> implements TrainerDao {

	public Trainer findById(int id) {
		return getByKey(id);
	}

	public void saveTrainer(Trainer trainer) {
		persist(trainer);
	}
	
	public void saveOrUpdate(Trainer trainer){
		super.saveOrUpdate(trainer);
	}
	
	public void deleteTrainerById(int id) {
		Query query = getSession().createSQLQuery("delete from trainer where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Trainer> findAllTrainers() {
		Criteria criteria = createEntityCriteria();
                
		return (List<Trainer>) criteria.list();
	}

	public Trainer findTrainerById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id",id));
		return (Trainer) criteria.uniqueResult();
	}
}
