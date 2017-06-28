/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.items;

import com.opengg.core.render.texture.Texture;

/**
 *
 * @author Warren
 */
public class Item {

    public String name;
    public Texture displaytexture;

    public Item(String name, Texture displaytexture) {
        this.name = name;
        this.displaytexture = displaytexture;
    }
    
    public Item(Item i){
        this.name = i.name;
        this.displaytexture = i.displaytexture;
    }
}
