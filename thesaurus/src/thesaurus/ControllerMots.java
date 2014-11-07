package thesaurus;

import java.awt.event.ActionEvent;
import java.util.TreeSet;

import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ControllerMots extends Controller {
	
	private Mot motCourant;
	
	public ControllerMots() {
		this.motCourant = null;
	}
	
	public ControllerMots(Mot m) {
		this.motCourant = m;
	}
	
	public void afficherMot(Mot m) {
		this.motCourant = m;
		VueMot vue = new VueMot(m);
		vue.afficher();
		fenetre.setView(vue);
	}
	
	public void afficherArborescenceMot(Mot m) {
		this.motCourant = m;
		TreeNode<Mot> racine = new TreeNode<Mot>(m);
		TreeNode<Mot> arbre = m.getArborescence(racine, racine);
		VueArborescenceMot vue = new VueArborescenceMot(arbre);
		vue.afficher();
		fenetre.setView(vue);
	}
	
	public void afficherAjout() {
		VueAjoutMot vue = new VueAjoutMot();
		vue.afficher();
		fenetre.setView(vue);
	}
	
	public void ajouterMot(Mot nouveauMot) {
		
	}
	
	public void modifierMot(Mot m) {
		
	}
	
	public void supprimerMot() {
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	public Mot getMotCourant() {
		return this.motCourant;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		switch(fenetre.getVueCourante().getListeOnglets().getSelectedIndex())
		{
		case 1 :
			this.afficherMot(new Mot("table"));
			break;
		case 2 :
			this.afficherAjout();
			break;
		case 3 :
			this.afficherArborescenceMot(new Mot("table"));
			break;
		};

	}
}
