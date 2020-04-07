package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] jb;
	// 2 create an integer variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		System.out.println("hi");
		String num = JOptionPane.showInputDialog("Give me a number");

		int number = Integer.parseInt(num);

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		jb = new JButton[number];
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < jb.length; i++) {
			// 6. initialize each JButton in the array
			jb[i] = new JButton();
			// 7. add the ActionListener to each JButton
			jb[i].addActionListener(this);
			// 8. add each JButton to the panel
			panel.add(jb[i]);
			System.out.println("hello");
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "click on the correct button");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		Random rand = new Random(number);
		hiddenButton = rand.nextInt(number);
		
		// 14. Set the text of the JButton located at hiddenButton to read "ME"

		jb[hiddenButton].setText("me");
		// 15. Use Thread.sleep(100); to pause the program.

		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.
	
			 jb[hiddenButton].setText("");

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.

		if (e.getSource() == jb[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You Win");
		} else {
			// 18. else tell them to try again
			JOptionPane.showMessageDialog(null, "try again");

		}

	}
}
