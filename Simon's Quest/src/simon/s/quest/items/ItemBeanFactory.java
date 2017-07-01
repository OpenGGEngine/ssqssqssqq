/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.items;

import java.util.HashMap;

/**
 *
 * @author Warren
 */
public class ItemBeanFactory {
    
    public static HashMap<String,Weapon> weapontemplate = new HashMap<>();
    public static HashMap<String,Item> templates = new HashMap<>();
    public static HashMap<String,ConsumableItem> contemplate = new HashMap<>();
    public static HashMap<String,Armor> armortemplate = new HashMap<>();
    
    
    public static void init(){
        templates.put("goldensimon", new Item("Golden Simon",null));
        armortemplate.put("armor", new Armor("Armor",null,1,1));
        armortemplate.put("armor2", new Armor("Armor2",null,1,1));
    }
            
    public static Item createItem(String name){
        if(weapontemplate.containsKey(name)){
            return new Weapon(weapontemplate.get(name));
        }else if(contemplate.containsKey(name)){
            return new ConsumableItem(contemplate.get(name));
        }else if(armortemplate.containsKey(name)){
            return new Armor(armortemplate.get(name));
        }else if(templates.containsKey(name)){
            return new Item(templates.get(name));
        }else{
            return null;
        }
    }
}
