package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import Vue.*;


/**
 * Cette classe est pour controleur l'action sur l'interface de AccueilInterface
 * 
 * @author Keze WEI
 * @author Xinyue ZHANG
 * 
 *
 */
public class ControleurNbJ1 {
	
	private JButton unBouton;
	
	/**
	 *  constructeur
	 * @param bouton
	 * un button
	 */
	public ControleurNbJ1 (JButton bouton){
		unBouton=bouton;
		
		// L'appuie sur le bouton
		unBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SetNbJoueur window = new SetNbJoueur();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}