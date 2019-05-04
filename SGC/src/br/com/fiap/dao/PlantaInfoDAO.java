package br.com.fiap.dao;

import javax.persistence.EntityManager;
import br.com.fiap.entity.PlantaInfo;


public class PlantaInfoDAO extends GenericDAO<PlantaInfo, Integer> {

	public PlantaInfoDAO(EntityManager em) {
		super(em);
	}

}