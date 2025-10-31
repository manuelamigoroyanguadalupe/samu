package Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjercicioLayoutA {
		JFrame jfrPrincipal = null;
		JPanel jpnPrincipal = null;
		JButton jbtNorte = null;
		JButton jbtSur = null;
		JButton jbtEste = null;
		JButton jbtOeste = null;
		JButton jbtCentro = null;
	public EjercicioLayoutA() {
		//Formulario
		    jfrPrincipal = new JFrame("EjercicioLayoutA");
			jfrPrincipal.setSize (500, 300);
			jfrPrincipal.setLocationRelativeTo(null);
			jfrPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		//Panel
			jpnPrincipal = new JPanel ();
			jpnPrincipal.setSize(500, 300);
			jpnPrincipal.setLayout(new BorderLayout());
			jfrPrincipal.add(jpnPrincipal);	
		
		//Boton Norte
			jbtNorte = new JButton ();
			jbtNorte.setText("Norte");
			jbtNorte.setBackground(Color.yellow);
			jpnPrincipal.add(jbtNorte, BorderLayout.NORTH);
		
		//Boton Sur
			jbtSur = new JButton ();
			jbtSur.setText("Sur");
			jbtSur.setBackground(Color.green);
			jpnPrincipal.add(jbtSur, BorderLayout.SOUTH);
		//Boton Este
			jbtEste = new JButton ();
			jbtEste.setText("Este");
			jbtEste.setBackground(Color.blue);
			jpnPrincipal.add(jbtEste, BorderLayout.EAST);
			
		//Boton Oeste
			jbtOeste = new JButton ();
			jbtOeste.setText("Oeste");
			jbtOeste.setBackground(Color.RED);
			jpnPrincipal.add(jbtOeste, BorderLayout.WEST);
	
		//Boton Centro
			jbtCentro = new JButton ();
			jbtCentro.setText("Centro");
			jbtCentro.setBackground(new Color(253, 221, 202));
			jpnPrincipal.add(jbtCentro, BorderLayout.CENTER);
			
		
		jfrPrincipal.setVisible(true);
	}

	public static void main(String[] args) {
	
		new EjercicioLayoutA(); 

	}

}
