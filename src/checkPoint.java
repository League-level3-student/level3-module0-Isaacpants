import javax.swing.JOptionPane;

public class checkPoint {
	int[] numbers = new int[5];
	
	// Use a for loop and JOptionPane.showInputDialog(String) to collect user input to fill the array.
  //  You will need to convert their input to an integer using Integer.parseInt(String).

  //  5. Using a separate for loop, calculate the total of the array and display using JOptionPane.showMessageDialog(null, String).

	
	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("Give me a number");
		String in = JOptionPane.showInputDialog("Give me a number");
		String inp = JOptionPane.showInputDialog("Give me a number");
		String inpu = JOptionPane.showInputDialog("Give me a number");
		String input = JOptionPane.showInputDialog("Give me a number");
		int nu = Integer.parseInt(input);
		int num = Integer.parseInt(inpu);
		int numb = Integer.parseInt(inp);
		int numbe = Integer.parseInt(in);
		int number = Integer.parseInt(i);
for (int j = 0; j < args.length; j++) {
	int total = nu+=num+=numb+=numbe+=number;
}
}
}
