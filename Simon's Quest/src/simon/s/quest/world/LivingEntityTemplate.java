/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest.world;

import com.opengg.core.math.Tuple;
import java.util.ArrayList;
import java.util.List;
import simon.s.quest.inventory.Inventory;

/**
 *
 * @author Javier
 */
public class LivingEntityTemplate {
    String dispname;
    String organization;

    float health;
    
    boolean randomizeInventory;
    Inventory inventory;
    
    List<Tuple<String, Integer>> itemweights = new ArrayList<>();
    
    public static LivingEntity generate(){
        
    }
}
