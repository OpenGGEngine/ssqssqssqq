/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.inventory;

import java.util.ArrayList;
import java.util.List;
import simon.s.quest.items.Armor;
import simon.s.quest.items.ConsumableItem;
import simon.s.quest.items.Item;
import static simon.s.quest.items.Item.*;
import simon.s.quest.items.Weapon;

/**
 *
 * @author Javier
 */
public class Inventory2 {
    public List<Item> items = new ArrayList<>();
    
    public void add(Item item){
        items.add(item);
    }
    
    public void remove(Item item){
        items.remove(item);
    }
    
    public void remove(int loc){
        items.remove(loc);
    }
    
    public List<Weapon> getWeapons(){
        List<Weapon> weapons = new ArrayList(items.size());
        
        for(Item item  : items)
            if(item.type == WEAPON)
                weapons.add((Weapon) item);
        return weapons;
    }
    
    public List<ConsumableItem> getConsumables(){
        List<ConsumableItem> consumables = new ArrayList(items.size());
        
        for(Item item  : items)
            if(item.type == CONSUMABLE)
                consumables.add((ConsumableItem) item);
        return consumables;
    }
    
    public List<Armor> getArmors(){
        List<Armor> armor = new ArrayList(items.size());
        
        for(Item item  : items)
            if(item.type == ARMOR)
                armor.add((Armor) item);
        return armor;
    }
}
