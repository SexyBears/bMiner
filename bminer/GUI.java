/*
 * Created by JFormDesigner on Mon Sep 02 19:51:22 BST 2013
 */

package bMiner;

import java.awt.*;
import javax.swing.*;

/**
 * @author rbnwxskd cbwndklm
 */
public class GUI extends JFrame {
	public GUI() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - wdjcnkd efvcnlkwe
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		cbOres = new JComboBox<>();
		dropore = new JCheckBox();
		Pickaxe = new JCheckBox();
		Emptybox = new JCheckBox();
		m1d1box = new JCheckBox();
		checkBox6 = new JCheckBox();
		dropbar = new JCheckBox();
		alch = new JCheckBox();
		label1 = new JLabel();
		button1 = new JButton();
		cbBanks = new JComboBox<>();
		label2 = new JLabel();
		checkBox9 = new JCheckBox();
		panel2 = new JPanel();
		CustomID = new JCheckBox();
		CustomText = new JTextField();
		label3 = new JLabel();

		//======== this ========
		setTitle("bMiner");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== tabbedPane1 ========
		{

			//======== panel1 ========
			{
				panel1.setLayout(null);

				//---- cbOres ----
				cbOres.setModel(new DefaultComboBoxModel<>(new String[] {
					"Clay",
					"Tin",
					"Copper",
					"Iron",
					"Silver",
					"Coal",
					"Gold",
					"Mithril",
					"Adamantite",
					"Runite",
					"Rune Essence"
				}));
				panel1.add(cbOres);
				cbOres.setBounds(60, 60, 152, cbOres.getPreferredSize().height);

				//---- dropore ----
				dropore.setText("Enable PowerMining");
				panel1.add(dropore);
				dropore.setBounds(new Rectangle(new Point(5, 5), dropore.getPreferredSize()));

				//---- Pickaxe ----
				Pickaxe.setText("Pickaxe in Inventory");
				panel1.add(Pickaxe);
				Pickaxe.setBounds(new Rectangle(new Point(10, 165), Pickaxe.getPreferredSize()));

				//---- Emptybox ----
				Emptybox.setText("::empty");
				panel1.add(Emptybox);
				Emptybox.setBounds(10, 185, Emptybox.getPreferredSize().width, 23);

				//---- m1d1box ----
				m1d1box.setText("M1D1");
				panel1.add(m1d1box);
				m1d1box.setBounds(new Rectangle(new Point(10, 145), m1d1box.getPreferredSize()));

				//---- checkBox6 ----
				checkBox6.setText("Enable Superheating");
				panel1.add(checkBox6);
				checkBox6.setBounds(new Rectangle(new Point(140, 165), checkBox6.getPreferredSize()));

				//---- dropbar ----
				dropbar.setText("Drop Bars");
				panel1.add(dropbar);
				dropbar.setBounds(new Rectangle(new Point(140, 185), dropbar.getPreferredSize()));

				//---- alch ----
				alch.setText("Enable High Alchemy");
				panel1.add(alch);
				alch.setBounds(new Rectangle(new Point(140, 145), alch.getPreferredSize()));

				//---- label1 ----
				label1.setText("Select the Ore you wish to mine:");
				panel1.add(label1);
				label1.setBounds(new Rectangle(new Point(60, 40), label1.getPreferredSize()));

				//---- button1 ----
				button1.setText("Start");
				panel1.add(button1);
				button1.setBounds(85, 220, 97, button1.getPreferredSize().height);

				//---- cbBanks ----
				cbBanks.setModel(new DefaultComboBoxModel<>(new String[] {
					"Varrock East",
					"Varrock West",
					"Mining Guild",
					"Neitznot",
					"Castle Wars"
				}));
				panel1.add(cbBanks);
				cbBanks.setBounds(60, 105, 150, cbBanks.getPreferredSize().height);

				//---- label2 ----
				label2.setText("Select where you wish to Bank:");
				panel1.add(label2);
				label2.setBounds(new Rectangle(new Point(60, 85), label2.getPreferredSize()));

				//---- checkBox9 ----
				checkBox9.setText("Drop Gems");
				panel1.add(checkBox9);
				checkBox9.setBounds(new Rectangle(new Point(195, 5), checkBox9.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel1.getComponentCount(); i++) {
						Rectangle bounds = panel1.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel1.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel1.setMinimumSize(preferredSize);
					panel1.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Mining", panel1);

			//======== panel2 ========
			{
				panel2.setLayout(null);

				//---- CustomID ----
				CustomID.setText("Enable Custom RockID Mining");
				panel2.add(CustomID);
				CustomID.setBounds(new Rectangle(new Point(5, 5), CustomID.getPreferredSize()));
				panel2.add(CustomText);
				CustomText.setBounds(45, 100, 190, CustomText.getPreferredSize().height);

				//---- label3 ----
				label3.setText("Please Enter a Custom RockID:");
				panel2.add(label3);
				label3.setBounds(new Rectangle(new Point(65, 75), label3.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel2.getComponentCount(); i++) {
						Rectangle bounds = panel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel2.setMinimumSize(preferredSize);
					panel2.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Custom Rock", panel2);
		}
		contentPane.add(tabbedPane1);
		tabbedPane1.setBounds(0, 0, 285, 275);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - wdjcnkd efvcnlkwe
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JComboBox<String> cbOres;
	private JCheckBox dropore;
	private JCheckBox Pickaxe;
	private JCheckBox Emptybox;
	private JCheckBox m1d1box;
	private JCheckBox checkBox6;
	private JCheckBox dropbar;
	private JCheckBox alch;
	private JLabel label1;
	private JButton button1;
	private JComboBox<String> cbBanks;
	private JLabel label2;
	private JCheckBox checkBox9;
	private JPanel panel2;
	private JCheckBox CustomID;
	private JTextField CustomText;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
