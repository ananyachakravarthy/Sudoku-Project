import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Creates the 9 big panels that hold the 81 individual BoardPanels that make up
 * the sudoku board.`
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 */
public class Panel extends JPanel {

	private Border blackBorder = BorderFactory.createLineBorder(Color.BLACK, 3);
	private int[][] boardPanelNum;
	private BoardPanel boardList[][];
	private int panelNumber;

	public BoardPanel returnBoard(int x, int y) {
		return boardList[x][y];
	}

	/**
	 * Creates a new Panel object made up of 9 BoardPanels.
	 */
	public Panel() {
		setBackground(Color.white);
		setFocusable(true);
		setBorder(blackBorder);
		setLayout(new GridLayout(3, 3));
		for (int p = 0; p < 9; p++) {
			BoardPanel panel = new BoardPanel();
			add(panel);
		}
	}

	/**
	 * Creates a new Panel object made up of 9 BoardPanels.
	 * 
	 * @param has
	 */
	public Panel(int x, int num) {
		setBackground(Color.white);
		setFocusable(true);
		boardPanelNum = new int[3][3];
		boardList = new BoardPanel[3][3];
		setBorder(blackBorder);
		setLayout(new GridLayout(3, 3));
		System.out.println(num);

		switch (num) {
		case 1:
			switch (x) {
			case 1:
				panelNumber = 1;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 2:
				panelNumber = 2;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 3:
				panelNumber = 3;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 4:
				panelNumber = 4;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 5:
				panelNumber = 5;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 6:
				panelNumber = 6;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 7:
				panelNumber = 7;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 8:
				panelNumber = 8;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 8;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 9:
				panelNumber = 9;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 8;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			}
			break;
		case 2:
			switch (x) {
			case 1:
				panelNumber = 1;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 5;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 2:
				panelNumber = 2;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 3:
				panelNumber = 3;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 4:
				panelNumber = 4;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 5:
				panelNumber = 5;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 6:
				panelNumber = 6;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 1;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 7:
				panelNumber = 7;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 8:
				panelNumber = 8;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 9:
				panelNumber = 9;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			}
			break;
		case 3:
			switch (x) {
			case 1:
				panelNumber = 1;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 2;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 1;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 2:
				panelNumber = 2;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 3:
				panelNumber = 3;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 4:
				panelNumber = 4;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 5:
				panelNumber = 5;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 6:
				panelNumber = 6;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 4;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 7:
				panelNumber = 7;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 8;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 8:
				panelNumber = 8;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 1;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 9:
				panelNumber = 9;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 5;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			}
			break;
		case 4:
			switch (x) {			
			case 1:
				panelNumber = 1;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 8;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 9;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 5;
							boardList[p][m] = panel2;
						}else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 2:
				panelNumber = 2;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 7;
						} else if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m,3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						}  else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 8, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 8;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 3:
				panelNumber = 3;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 4:
				panelNumber = 4;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 5;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 3;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 5:
				panelNumber =5;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						}  else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 5;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 6:
				panelNumber =6;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 1, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 1;
						} else if (p == 0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 4;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 7:
				panelNumber =7;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 4;
						} else if (p == 1 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 6;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 8:
				panelNumber =8;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p ==0 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 9, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 9;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 4, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 4;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 5, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 5;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			case 9:
				panelNumber =9;
				for (int p = 0; p < 3; p++) {
					for (int m = 0; m < 3; m++) {
						if (p == 0 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 6, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 6;
							boardList[p][m] = panel2;
						} else if (p == 1 && m == 0) {
							BoardPanel panel2 = new BoardPanel(p, m, 2, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 2;
						} else if (p == 1 && m == 1) {
							BoardPanel panel2 = new BoardPanel(p, m, 7, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 7;
							boardList[p][m] = panel2;
						} else if (p == 2 && m == 2) {
							BoardPanel panel2 = new BoardPanel(p, m, 3, panelNumber);
							add(panel2);
							boardPanelNum[p][m] = 3;
							boardList[p][m] = panel2;
						} else {
							BoardPanel panel2 = new BoardPanel(p, m, 0, panelNumber);
							add(panel2);
							boardList[p][m] = panel2;
							boardPanelNum[p][m] = 0;
						}
					}
				}
				break;
			}
			break;
		}

	}
}