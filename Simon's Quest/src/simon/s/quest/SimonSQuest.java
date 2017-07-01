/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.s.quest;

import com.opengg.core.engine.GGApplication;
import com.opengg.core.engine.OpenGG;
import com.opengg.core.engine.RenderEngine;
import com.opengg.core.engine.Resource;
import com.opengg.core.render.shader.ShaderController;
import com.opengg.core.render.texture.Cubemap;
import com.opengg.core.render.window.WindowInfo;
import com.opengg.core.render.window.WindowOptions;
import com.opengg.core.world.Skybox;
import simon.s.quest.items.ItemBeanFactory;

/**
 *
 * @author Warren
 */
public class SimonSQuest extends GGApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WindowInfo w = new WindowInfo();
        w.name = "Simon, Simon Quest Simon's Simon Quest Simon Simon Quest Quest";
        w.displaymode = WindowOptions.WINDOWED;
        w.width = 1920;
        w.height = 1080;
        w.resizable = true;
        w.type = "GLFW";
        w.vsync = true;
        OpenGG.initialize(new SimonSQuest(), w);
    }
    
    @Override
    public void setup() {
        Player.inv.addItem(ItemBeanFactory.createItem("goldensimon"));
        RenderEngine.setSkybox(new Skybox(Cubemap.get(Resource.getTexturePath("skybox\\majestic")), 1500f));       
    }
    
    @Override
    public void render() {
        ShaderController.setPerspective(90, OpenGG.getWindow().getRatio(), 0.2f, 3000f);
    }
    
    @Override
    public void update() {
        
    }
    
}
