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
public class Weapon extends Item{
    public int attack;

    public Weapon(String name, Texture displaytexture,int att) {
        super(name, displaytexture);
        this.attack = att;
    }
    
    public Weapon(Weapon w){
        super(w.name, w.displaytexture);
        this.attack = w.attack;
    }
    
}
