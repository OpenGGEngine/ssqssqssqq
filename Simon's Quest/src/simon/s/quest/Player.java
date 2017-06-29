/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest;

import simon.s.quest.inventory.Inventory;

/**
 *
 * @author Warren
 */
public class Player {
    
    public static String name;
    
    public static Inventory inv = new Inventory();

    public static int health;

    public static double cash;

    public static int level;
    public static int exptonextlevel;
    public static int exp;
    
    public static int soulurge;
    public static int destinynumber;
    
    public static int attack;
    public static int defense;
    
    public static int mattack;
    public static int mdefense;
}
