/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.inventory;

import java.util.ArrayList;
import simon.s.quest.items.Armor;
import simon.s.quest.items.ConsumableItem;
import simon.s.quest.items.Item;
import simon.s.quest.items.Weapon;

/**
 *
 * @author Warren
 */
public class Inventory {
    
    public ArrayList<Item> keyitems = new ArrayList<>();
    public ArrayList<Armor> armor = new ArrayList<>();
    public ArrayList<Weapon> weapons = new ArrayList<>();
    public ArrayList<ConsumableItem> consumables = new ArrayList<>();

    public void addItem(Item i) {
        if (i != null) {
            if (i instanceof Armor) {
                Armor temp = findItem(armor,(Armor)i);
                if(temp == null){
                    i.quantity = 1;
                    armor.add((Armor)i);
                }else{
                    temp.quantity+=1;
                }
            } else if (i instanceof Weapon) {
                Weapon temp = findItem(weapons,(Weapon)i);
                if(temp == null){
                    i.quantity = 1;
                    weapons.add((Weapon)i);
                }else{
                    temp.quantity+=1;
                }
            } else if (i instanceof ConsumableItem) {
                ConsumableItem temp = findItem(consumables,(ConsumableItem)i);
                if(temp == null){
                    i.quantity = 1;
                    consumables.add((ConsumableItem)i);
                }else{
                    temp.quantity+=1;
                }
            }
        }
    }
    public static <E extends Item> E findItem(ArrayList<E> list,E i){
        for(E item: list){
             if(((E)item).equals((E)i)){
                return item;
            }
        }
        return null;
    }
    
    public void remove(Item i){
        
    }
    
    
}
