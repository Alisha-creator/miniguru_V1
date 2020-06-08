package com.miniguru.dao;

	import java.util.List;

	import javax.persistence.Query;
	import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.persistence.criteria.Root;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.miniguru.entity.*;

	@Repository
	public class contactusDAOImpl implements contactusDAO {

	    @Autowired
	    private SessionFactory sessionFactory;
	    
	    public SessionFactory getSessionFactory() {
	    	return sessionFactory;
	    }

	    @Override
	    public void savecontactus(contactus contactus) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(contactus);
	    }

	}
