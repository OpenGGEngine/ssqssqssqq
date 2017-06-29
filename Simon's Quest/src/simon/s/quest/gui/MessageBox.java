/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.gui;

import com.opengg.core.engine.Resource;
import com.opengg.core.gui.GUIGroup;
import com.opengg.core.gui.GUIText;
import com.opengg.core.math.Vector2f;
import com.opengg.core.render.Text;
import com.opengg.core.render.texture.text.GGFont;

/**
 *
 * @author Warren
 */
public class MessageBox {

    private static String currentmessage;
    private static double currenttextpointer;
    
    static GGFont font = Resource.getFont("test", "test.png");
    static GUIGroup mbox = GUIMaster.messagebox;
    static GUIText message = new GUIText(font, new Vector2f(0.20f,0f));

    public static void init() {
        mbox.addItem("text", message);
        message.setText("d");
        message.text.setFontSize(1.3f);
        message.text.setLineSize(0.75f);
        
        message.text.setNumberOfLines(4);
     
    }

    public static void mbox(String s) {
        currenttextpointer = 0;
        currentmessage = s;
    }
    
    public static void update() {
        
        if (currentmessage != null && currenttextpointer <currentmessage.length() ) {
            currenttextpointer+=0.4;
            message.setText(currentmessage.substring(0, (int)currenttextpointer));
        }
        if(message.text.getNumberOfLines()>4){
            message.setPositionOffset(new Vector2f(0.2f,(message.text.getNumberOfLines()-4) * 0.048f));
        }
    }
}
