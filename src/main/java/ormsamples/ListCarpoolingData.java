/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListCarpoolingData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		java.util.List lUserList = fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.User").setMaxResults(ROW_COUNT).list();
		fr.fges.ramm.api.User[] lfrfgesrammapiUsers = (fr.fges.ramm.api.User[]) lUserList.toArray(new fr.fges.ramm.api.User[lUserList.size()]);
		int length = Math.min(lfrfgesrammapiUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lfrfgesrammapiUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Adress...");
		java.util.List lAdressList = fr.fges.ramm.api.CarpoolingPersistentManager.instance().getSession().createQuery("From fr.fges.ramm.api.Adress").setMaxResults(ROW_COUNT).list();
		fr.fges.ramm.api.Adress[] lfrfgesrammapiAdresss = (fr.fges.ramm.api.Adress[]) lAdressList.toArray(new fr.fges.ramm.api.Adress[lAdressList.size()]);
		length = Math.min(lfrfgesrammapiAdresss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lfrfgesrammapiAdresss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListCarpoolingData listCarpoolingData = new ListCarpoolingData();
			try {
				listCarpoolingData.listTestData();
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
