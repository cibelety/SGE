package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PlantaInfoDAO;
import br.com.fiap.entity.PlantaInfo;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		PlantaInfoDAO plantaInfoDao;

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		plantaInfoDao = new PlantaInfoDAO(em);

		PlantaInfo plantaInfo;

		try {
			plantaInfo = new PlantaInfo("Nome teste", null, null, null, null, null, null, null, null, null, null);

			plantaInfoDao.cadastrar(plantaInfo);
			plantaInfoDao.commit();

		} catch (Exception e) {
			e.printStackTrace();
		//	fail("Errou...");
		}
	}

}
