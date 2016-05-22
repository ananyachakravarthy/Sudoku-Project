import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * \ Creates smallest box for sudoku board that highlights box when pressed on.
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 *
 */
public class BoardPanel extends JPanel implements MouseListener {
	Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
	Border greenBorder = BorderFactory.createLineBorder(Color.CYAN, 5);
	private boolean isSelected;
	private int[][] numOnPanel = new int[3][3];
	private int number, x, y, panelNum;
	Color color;
	private BoardPanel pan;

	public int getBoardNum(int x, int y) {
		return numOnPanel[x][y];
	}

	/**
	 * Creates a BoardPanel object with a number label and black border with
	 * white background.
	 */
	public BoardPanel() {
		setBackground(Color.white);
		addMouseListener(this);
		setBorder(blackBorder);
		setFocusable(true);
		addLable();
	}

	public BoardPanel(int num) {
		setBackground(Color.white);
		addMouseListener(this);
		setBorder(blackBorder);
		setFocusable(true);
		number = num;
		if (num != 0)
			addLable(num);
	}

	public BoardPanel(int x, int y, int num, int panel) {
		panelNum = panel;
		numOnPanel[x][y] = num;
		this.x = x;
		this.y = y;
		setBackground(Color.white);
		addMouseListener(this);
		setBorder(blackBorder);
		setFocusable(true);
		number = num;
		if (num != 0)
			addLable(num);
	}

	public int returnX() {
		return x;
	}

	public int returnY() {
		return y;
	}

	public int returnNum() {
		return number;
	}

	public int returnPanelNum() {
		return panelNum;
	}

	public BoardPanel changePanel() {
		return pan;
	}

	/**
	 * returns color of text in panel
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Adds number to box.
	 */
	public void addLable(int num) {
		String str = "" + num;
		JLabel label = new JLabel(str);
		label.setForeground(Color.black);
		color = Color.black;
		label.setFont(new Font("Serif", Font.PLAIN, 30));
		setOpaque(true);
		add(label);
	}

	/**
	 * Adds user input to box
	 */
	public void addUserLable(int num) {
		String str = "" + num;
		JLabel label = new JLabel(str);
		label.setForeground(Color.blue);
		color = Color.blue;
		label.setFont(new Font("Serif", Font.PLAIN, 30));
		setOpaque(true);
		add(label);
	}

	public void addNum(int num) {
		this.addUserLable(num);
	}

	/**
	 * Adds number to box.
	 */
	public void addLable() {
		JLabel label = new JLabel("");
		label.setFont(new Font("Serif", Font.PLAIN, 30));
		setOpaque(true);
		add(label);
	}

	/**
	 * When box is clicked, the box is highlighted light blue, coordinates of
	 * the box are returned
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (isSelected) {
			setBorder(blackBorder);
			pan = (BoardPanel) e.getSource();
		} else
			setBorder(greenBorder);
		isSelected = !isSelected;

		Object source = e.getSource();
		if (source instanceof BoardPanel) {
			pan = (BoardPanel) source;
		}
		
		/*
		 * if(isSelected){ System.out.print(this.returnX() + " ");
		 * System.out.print(this.returnY()+ " ");
		 * System.out.print(this.returnNum()+ " ");
		 * System.out.print(this.returnPanelNum()+ " "); this.getColor();
		 * this.returnSelected(); }
		 */
	}

	public boolean returnSelected() {
		return isSelected;
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
