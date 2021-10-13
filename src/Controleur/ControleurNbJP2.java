package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Vue.SetNbJP;
import Modele.Accueuil;

/**
 * /**
 * Cette classe est pour controleur l'action sur l'interface de SetNbJoueur
 * 
 * @author Keze WEI
 * @author Xinyue ZHANG
 * 
 *
 */
public class ControleurNbJP2 {

	

	private JButton unBouton_3;
	private JButton unBouton_4;
	

	/**
	 * constructeur
	 * @param bouton
	 * un boutton pour 3 joueurs
	 * @param bouton1
	 * un boutton pour 4 joueurs
	 */
	public ControleurNbJP2 (JButton bouton,JButton bouton1){
		unBouton_3=bouton;
		unBouton_4=bouton1;
		Accueuil a= Accueuil.getInstance();
		
		
			// L'appuie sur le bouton
		unBouton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			a.setnbJoueur(3);
			try {
				SetNbJP window = new SetNbJP(3);
				window.frame.setVisible(true);					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
		
		unBouton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setnbJoueur(4);
				try {
					SetNbJP window = new SetNbJP(4);
					window.frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			});
	}
}
