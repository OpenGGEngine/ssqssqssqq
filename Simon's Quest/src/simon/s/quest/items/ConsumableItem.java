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
public class ConsumableItem extends Item{
    public int healthbonus;

    public ConsumableItem(String name, Texture displaytexture,int health) {
        super(name, displaytexture);
        this.healthbonus = health;
        this.type = CONSUMABLE;
    }
    public ConsumableItem(ConsumableItem i){
         super(i.name, i.displaytexture);
        this.healthbonus = i.healthbonus;
        this.type = CONSUMABLE;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ConsumableItem other = (ConsumableItem) obj;
        if ((this.healthbonus != other.healthbonus) || (!this.name.equals(other.name))) {
            return false;
        }
        return true;
    }
    
    
}
