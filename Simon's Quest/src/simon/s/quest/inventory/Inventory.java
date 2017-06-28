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
                armor.add((Armor) i);
            } else if (i instanceof Weapon) {
                weapons.add((Weapon) i);
            } else if (i instanceof ConsumableItem) {
                consumables.add((ConsumableItem) i);
            }
        }
    }
}
