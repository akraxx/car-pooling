/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateCarpoolingData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().beginTransaction();
		try {
			fr.fges.ramm.api.User lfrfgesrammapiUser = new fr.fges.ramm.api.User();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : adress
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().save(lfrfgesrammapiUser);
			
			fr.fges.ramm.api.Adress lfrfgesrammapiAdress = new fr.fges.ramm.api.Adress();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().save(lfrfgesrammapiAdress);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCarpoolingData createCarpoolingData = new CreateCarpoolingData();
			try {
				createCarpoolingData.createTestData();
			}
			finally {
				fr.fges.ramm.api.CarpoolingPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
