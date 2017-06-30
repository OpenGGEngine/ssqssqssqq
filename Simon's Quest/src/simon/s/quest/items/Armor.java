/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.items;

import com.opengg.core.render.texture.Texture;
import java.util.Objects;

/**
 *
 * @author Warren
 */
public class Armor extends Item {
    
    public String displayname;
    public int defenseboost;
    public int attackboost;

    public Armor(String name, Texture displaytexture,int def,int att) {
        super(name, displaytexture);
        this.attackboost = att;
        this.defenseboost = def;
        this.type = ARMOR;
    }
    
    public Armor(Armor a){
        super(a.name, a.displaytexture);
        this.attackboost = a.attackboost;
        this.defenseboost = a.defenseboost;
        this.type = ARMOR;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Armor other = (Armor) obj;
        if (!Objects.equals(this.displayname, other.displayname) ) {
            return false;
        }
        if (this.defenseboost != other.defenseboost || (!this.name.equals(other.name)) ||
                this.attackboost != other.attackboost) {
            return false;
        }
        return true;
    }


}
