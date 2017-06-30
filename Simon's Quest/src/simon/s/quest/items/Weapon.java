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
public class Weapon extends Item{
    
    public String displayname;
    public int attack;

    public Weapon(String name, Texture displaytexture,int att) {
        super(name, displaytexture);
        this.attack = att;
        this.type = WEAPON;
    }
    
    public Weapon(Weapon w){
        super(w.name, w.displaytexture);
        this.attack = w.attack;
        this.type = WEAPON;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.displayname, other.displayname)) {
            return false;
        }
        if ((this.attack != other.attack) || (!this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

}
