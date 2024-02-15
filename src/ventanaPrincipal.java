import java.awt.Color;

import javax.swing.*;

class VentanaInicio extends JFrame{
	public VentanaInicio() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setLocationRelativeTo(null);
		setTitle("FORMULARIO DE REGISTRO");
		setVisible(true);
		
		
		JLabel txtPrimer = new JLabel("The CLASSIC FORM includes all visible fields for this list");
		txtPrimer.setBounds(10, 10, 380, 20);
		add(txtPrimer);
		
		JLabel txtSegundo = new JLabel("Form options");
		txtSegundo.setBounds(10, 30, 380, 20);
		add(txtSegundo);
		
		JLabel txtTercero = new JLabel("Include the following: ");
		txtTercero.setBounds(10, 50, 380, 20);
		add(txtTercero);
		
		JCheckBox checkTitle = new JCheckBox("a title for your from");
		checkTitle.setBounds(10, 68, 380, 20);
		add(checkTitle);
		
		JTextField cajaSubscribe = new JTextField(10);
		cajaSubscribe.setBounds(10, 80, 300, 26);
		add(cajaSubscribe);
		
        ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radioonly = new JRadioButton("only required fields");
		radioonly.setBounds(10, 120, 300, 20);
		bg.add(radioonly);
		add(radioonly);
		JRadioButton radioalf= new JRadioButton("all fields");
		radioalf.setBounds(10, 140, 300, 20);
		bg.add(radioalf);
		add(radioalf);
		
		JLabel txtCuarto = new JLabel("(edit required fields in the form builder)");
		txtCuarto.setBounds(20, 155, 380, 20);
		add(txtCuarto);
		
		JLabel txtIndicates = new JLabel("* indicates required");
		txtIndicates.setBounds(650, 10, 380, 20);
		add(txtIndicates);
		
		
		JLabel txtQuinto = new JLabel("Preview");
		txtQuinto.setBounds(400, 10, 380, 20);
		add(txtQuinto);
		
		JLabel txtEmail = new JLabel("Email Address ");
		txtEmail.setBounds(400, 30, 380, 20);
		add(txtEmail);
		JTextField cajaEmail = new JTextField(10);
		cajaEmail.setBounds(400, 50, 380, 20);
		add(cajaEmail);
		
		JLabel txtFirstName = new JLabel("First Name ");
		txtFirstName.setBounds(400, 68, 380, 20);
		add(txtFirstName);
		JTextField cajaFirst= new JTextField(10);
		cajaFirst.setBounds(400, 85, 380, 20);
		add(cajaFirst);
		
		JLabel txtLastName = new JLabel("Last Name ");
		txtLastName.setBounds(400, 100, 380, 20);
		add(txtLastName);
		JTextField cajaLast= new JTextField(10);
		cajaLast.setBounds(400, 120, 380, 20);
		add(cajaLast);
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(400, 150, 180, 20);
		add(btnSubscribe);
		
		JLabel txtComentarios= new JLabel("Copy/paste onto your site ");
		txtComentarios.setBounds(400, 180, 380, 20);
		add(txtComentarios);
		
		JTextArea areaComentarios = new JTextArea(5, 10);
		areaComentarios.setBounds(400, 200, 380, 80);
		add(areaComentarios);
		
		JCheckBox checkInterest = new JCheckBox("interest group fields");
		checkInterest.setBounds(10, 180, 380, 20);
		add(checkInterest);
		
		JCheckBox checkRequired = new JCheckBox("required group fields");
		checkRequired.setBounds(10, 200, 380, 20);
		add(checkRequired);
		
		JLabel txtSet = new JLabel("Set form width");
		txtSet.setBounds(10, 220, 380, 20);
		add(txtSet);
		JTextField cajaSet= new JTextField(10);
		cajaSet.setBounds(10, 240, 380, 20);
		add(cajaSet);
		
		JLabel txtEnhance = new JLabel("Enhance your form");
		txtEnhance.setBounds(10, 260, 380, 20);
		add(txtEnhance);
		
		
		JCheckBox checkEnable = new JCheckBox("enable evil popup made");
		checkEnable.setBounds(10, 280, 380, 20);
		add(checkEnable);
		
		JCheckBox checkdisable = new JCheckBox("disable all Java Script");
		checkdisable.setBounds(10, 300, 380, 20);
		add(checkdisable);
		
		JCheckBox checklink = new JCheckBox("include archive link");
		checklink.setBounds(10, 320, 380, 20);
		add(checklink);
		
		JCheckBox checkIncludeMod = new JCheckBox("include MonkeyRewards link");
		checkIncludeMod.setBounds(10, 340, 380, 20);
		add(checkIncludeMod);
		
		
		
		
	}
	
}






public class ventanaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaInicio();

			}
		});
	}

}
