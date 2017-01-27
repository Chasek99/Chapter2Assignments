/**
 * 
 */
package dialogboxes;
import javax.swing.JOptionPane;
/**
 * @author CK121642
 *
 */
public class AirlineDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null,
				"Do you want to upgrade to first class?");
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "you responded " + isYes);

	}

}
