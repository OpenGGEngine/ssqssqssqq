/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.world;

import java.util.HashMap;

/**
 *
 * @author Javier
 */
public class Faction {
    public static HashMap<String, Faction> orgs = new HashMap<>();
    
    String name;
    float playerattraction;
    
    public Faction(String name, int attraction){
        this.name = name;
        this.playerattraction = attraction;
    }
}
