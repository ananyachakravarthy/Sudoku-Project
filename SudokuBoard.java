import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * Creates a sudoku board with 9 Panels.
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 */
public class SudokuBoard extends JPanel {

	private int panelNum;
	int[] panelNumList;
	ArrayList<Panel> panelList;

	/**
	 * Creates a 600 by 600 board
	 */
	public SudokuBoard() {
		panelNumList = new int[10];
		panelList= new ArrayList <Panel> (10);
		panelList.add(new Panel());
		setBackground(Color.white);
		setFocusable(true);
		setSize(600, 600);
		GridLayout grid = new GridLayout(3, 3);
		setLayout(grid);
		enterPanels(this);
	}

	/**
	 * Returns the number on the grid at the specified coordinates; returns 0 if no number
	 * @param panel
	 * @param x
	 * @param y
	 * @return
	 */
	public int getBPNum(int panel, int x, int y){
		Panel pan = panelList.get(panel);
		BoardPanel pan2 = pan.returnBoard(x, y);
		return pan2.getBoardNum(x, y);
	}
	
	public BoardPanel getBP(int panel, int x, int y){
		Panel pan = panelList.get(panel);
		BoardPanel pan2 = pan.returnBoard(x, y);
		return pan2;
	}
	

	/**
	 * Adds Panel objects to the sudoku board.
	 * @param board
	 */
	public void enterPanels(JPanel board) {
		int num = 1;
		int p = (int) (Math.random()* 4)+1;
		switch (num) {
		case 1:
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					if (row == 0 && col == 0) {
						Panel panel1 = new Panel(1, p);
						board.add(panel1);
						panelNumList[1]= 1;
						panelList.add(panel1);
						panelNum = 1;
					}
					if (row == 0 && col == 1) {
						Panel panel1 = new Panel(2, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[2] = 2;
						panelNum = 2;
					}
					if (row == 0 && col == 2) {
						Panel panel1 = new Panel(3, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[3] = 3;
						panelNum = 3;
					}
					if (row == 1 && col == 0) {
						Panel panel1 = new Panel(4, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[4] = 4;
						panelNum = 4;
					}
					if (row == 1 && col == 1) {
						Panel panel1 = new Panel(5, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[5] = 5;
						panelNum = 5;
					}
					if (row == 1 && col == 2) {
						Panel panel1 = new Panel(6, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[6] = 6;
						panelNum = 6;
					}
					if (row == 2 && col == 0) {
						Panel panel1 = new Panel(7, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[7] = 7;
						panelNum = 7;
					}
					if (row == 2 && col == 1) {
						Panel panel1 = new Panel(8, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[8] = 8;
						panelNum = 8;
					}
					if (row == 2 && col == 2) {
						Panel panel1 = new Panel(9, p);
						board.add(panel1);
						panelList.add(panel1);
						panelNumList[9] = 9;
						panelNum = 9;
					}
				}
			}
			board.setVisible(true);
			break;

		}

	}
}
