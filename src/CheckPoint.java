import javax.swing.JOptionPane;

public class CheckPoint{
	//4. Use a for loop and JOptionPane.showInputDialog(String) to collect user input to fill the array.
  //  You will need to convert their input to an integer using Integer.parseInt(String).

    //5. Using a separate for loop, calculate the total of the array and display using JOptionPane.showMessageDialog(null, String).
	
	
	static int[] num = new int[5];
	public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		String input = JOptionPane.showInputDialog("Give me a number");
		int newnum = Integer.parseInt(input);
		num[i]=newnum;
	}
	int total=0;
	for (int i = 0; i <num.length; i++) {
		total+=num[i];
		
	}
	JOptionPane.showMessageDialog(null, total);
}
}
