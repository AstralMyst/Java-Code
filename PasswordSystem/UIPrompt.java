
/**
 * makes all the prompts
 *
 * @author kody
 * @version 1
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class UIPrompt
{   
    public String Prompt(String Title, String Question) { 
        String Response = JOptionPane.showInputDialog(Title, Question);
        return Response;
    }
}
