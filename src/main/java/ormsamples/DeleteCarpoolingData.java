/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteCarpoolingData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().beginTransaction();
		try {
			fr.fges.ramm.api.User lfrfgesrammapiUser= (fr.fges.ramm.api.User)fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.User").setMaxResults(1).uniqueResult();
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().delete(lfrfgesrammapiUser);
			
			fr.fges.ramm.api.Adress lfrfgesrammapiAdress= (fr.fges.ramm.api.Adress)fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.Adress").setMaxResults(1).uniqueResult();
			fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().delete(lfrfgesrammapiAdress);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			DeleteCarpoolingData deleteCarpoolingData = new DeleteCarpoolingData();
			try {
				deleteCarpoolingData.deleteTestData();
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
