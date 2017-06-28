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
public class Armor extends Item {

    public int defenseboost;
    public int attackboost;

    public Armor(String name, Texture displaytexture,int def,int att) {
        super(name, displaytexture);
        this.attackboost = att;
        this.defenseboost = def;
    }
    
    public Armor(Armor a){
        super(a.name, a.displaytexture);
        this.attackboost = a.attackboost;
        this.defenseboost = a.defenseboost;
    }

}
