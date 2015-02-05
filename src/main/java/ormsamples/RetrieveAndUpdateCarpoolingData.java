/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateCarpoolingData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().beginTransaction();
		try {
			fr.fges.ramm.api.User lfrfgesrammapiUser= (fr.fges.ramm.api.User)fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.User").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().update(lfrfgesrammapiUser);
			
			fr.fges.ramm.api.Adress lfrfgesrammapiAdress= (fr.fges.ramm.api.Adress)fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.Adress").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().update(lfrfgesrammapiAdress);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateCarpoolingData retrieveAndUpdateCarpoolingData = new RetrieveAndUpdateCarpoolingData();
			try {
				retrieveAndUpdateCarpoolingData.retrieveAndUpdateTestData();
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
