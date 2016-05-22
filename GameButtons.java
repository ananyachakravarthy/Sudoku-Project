import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates number buttons for the numbers 1-9 and a submit button.
 * 
 * @author Ananya Chakravarthy and Crystal Sun
 *
 */
public class GameButtons extends JPanel {

	//private JButton bCheck, bClearBoard, bNewGame;
	 JButton one, two, three, four, five, six, seven, eight, nine;
	 JButton bCheck, bClearBoard,bNewGame, bExit ;
	public GameButtons() {
		
		setSize(500, 500);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		add(mainPanel, BorderLayout.NORTH);

		JPanel options = new JPanel(new FlowLayout(FlowLayout.LEADING));
		options.setBorder(BorderFactory.createTitledBorder(" Options "));
		mainPanel.add(options);

		bCheck = new JButton("Check");
		bClearBoard = new JButton("Clear Board");
		bNewGame = new JButton("New Game");
		bExit = new JButton("Exit");
		options.add(bNewGame);
		options.add(bClearBoard);
		options.add(bCheck);
		options.add(bExit);
		
		JPanel numbers = new JPanel(new FlowLayout(FlowLayout.LEADING));
		numbers.setBorder(BorderFactory.createTitledBorder(" Numbers "));
		mainPanel.add(numbers);
		
		one = new JButton("1");
		two= new JButton("2");
		three= new JButton("3");
		four= new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven =new JButton("7");
		eight = new JButton("8");
		nine =new JButton("9");
		
		numbers.add(one);
		numbers.add(two);
		numbers.add(three);
		numbers.add(four);
		numbers.add(five);
		numbers.add(six);
		numbers.add(seven);
		numbers.add(eight);
		numbers.add(nine);
	}
	

	 /**
     * Adds controller to all components.
     *
     * @param buttonController  Controller which controls all user actions.
     */
    public void setController(ButtonController buttonController) {
        bCheck.addActionListener(buttonController);
        bNewGame.addActionListener(buttonController);
        bClearBoard.addActionListener(buttonController);
        bExit.addActionListener(buttonController);
        one.addActionListener(buttonController);
        two.addActionListener(buttonController);
        three.addActionListener(buttonController);
        four.addActionListener(buttonController);
        five.addActionListener(buttonController);
        six.addActionListener(buttonController);
        seven.addActionListener(buttonController);
        eight.addActionListener(buttonController);
        nine.addActionListener(buttonController);
    }

}
