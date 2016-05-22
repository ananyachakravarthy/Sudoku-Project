import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import java.awt.event.MouseAdapter;

/**
 * 
 * Determines what happens when each button from the button class is clicked.
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 *
 */
public class ButtonController extends JPanel implements ActionListener, MouseListener {

	private SudokuGame game;
	private BoardPanel pan, pan2;

	public ButtonController(SudokuGame game) {
		this.game = game;
	}

	/**
	 * Determines what button was clicked and what happens after.
	 */
	public void processButton() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New Game"))
			game.newGame();
		else if (e.getActionCommand().equals("Check"))
			game.checkGame();
		else if (e.getActionCommand().equals("Clear Board"))
			game.clearBoard();
		else if (e.getActionCommand().equals("Exit"))
			System.exit(0);
		else if (e.getActionCommand().equals("1")) {
			pan2 = new BoardPanel(0, 0, 1, 0);
			pan2.addUserLable(1);
			System.out.println(pan2.returnX());
		} else
			game.setSelectedNumber(Integer.parseInt(e.getActionCommand()));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pan2 = pan.changePanel();
		System.out.println(pan2.returnX());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
