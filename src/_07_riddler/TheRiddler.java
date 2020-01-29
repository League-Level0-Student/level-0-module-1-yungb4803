package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.contentEquals("E")) {
			JOptionPane.showMessageDialog(null, "Correct!");
	score++;
		}
		

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! It is the letter E");
			
		}

		// 6. Add some more riddles
		String second = JOptionPane.showInputDialog("What are moving left to right right now?");
if (second.contentEquals("your eyes")) {
	JOptionPane.showMessageDialog(null,"Correct!");
score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! Its your eyes");
}

// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
		
	}
}

