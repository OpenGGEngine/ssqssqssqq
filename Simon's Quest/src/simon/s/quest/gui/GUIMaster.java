/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.gui;

import com.opengg.core.gui.GUI;
import com.opengg.core.gui.GUIGroup;
import com.opengg.core.math.Vector2f;

/**
 *
 * @author Warren
 */
public class GUIMaster {
    
    public static GUIGroup root = GUI.root;
    public static GUIGroup messagebox;
    
    public static void init(){
        messagebox = new GUIGroup(new Vector2f(0,0));
        GUI.root.addItem("message", messagebox);
        
    }
}
