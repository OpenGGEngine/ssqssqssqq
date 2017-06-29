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
import com.opengg.core.math.Vector2f;
import com.opengg.core.render.Text;
import com.opengg.core.render.shader.ShaderController;
import com.opengg.core.render.texture.Cubemap;
import com.opengg.core.render.window.WindowInfo;
import com.opengg.core.render.window.WindowOptions;
import static com.opengg.core.render.window.WindowOptions.GLFW;
import com.opengg.core.world.Skybox;
import simon.s.quest.gui.GUIMaster;
import simon.s.quest.gui.MessageBox;
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
        w.type = GLFW;
        w.vsync = true;
        OpenGG.initialize(new SimonSQuest(), w);
    }
    
    @Override
    public void setup() {
        
        ItemBeanFactory.init();
        Player.inv.addItem(ItemBeanFactory.createItem("goldensimon"));
        Player.inv.addItem(ItemBeanFactory.createItem("armor"));
        Player.inv.addItem(ItemBeanFactory.createItem("armorwan"));
        
        System.out.println("Key: "+Player.inv.keyitems.size());
        System.out.println("Armor: "+Player.inv.armor.size());
        System.out.println("Weapon: "+Player.inv.weapons.size());
        System.out.println("Con: "+Player.inv.consumables.size());
        GUIMaster.init();
        MessageBox.init();
        
        MessageBox.mbox("Friends, Romans, countrymen, lend me your ears; " +
"I come to bury Caesar, not to praise him. " +
"The evil that men do lives after them; " +
"The good is oft interred with their bones; " +
"So let it be with Caesar. The noble Brutus " +
"Hath told you Caesar was ambitious: " +
"If it were so, it was a grievous fault, " +
"And grievously hath Caesar answer'd it. " +
"Here, under leave of Brutus and the rest-- " +
"For Brutus is an honourable man; " +
"So are they all, all honourable men-- " +
"Come I to speak in Caesar's funeral. " +
"He was my friend, faithful and just to me: " +
"But Brutus says he was ambitious; " +
"And Brutus is an honourable man. " +
"He hath brought many captives home to Rome " +
"Whose ransoms did the general coffers fill: " +
"Did this in Caesar seem ambitious? " +
"When that the poor have cried, Caesar hath wept: " +
"Ambition should be made of sterner stuff: " +
"Yet Brutus says he was ambitious; " +
"And Brutus is an honourable man. " +
"You all did see that on the Lupercal " +
"I thrice presented him a kingly crown, " +
"Which he did thrice refuse: was this ambition? " +
"Yet Brutus says he was ambitious; " +
"And, sure, he is an honourable man. " +
"I speak not to disprove what Brutus spoke, " +
"But here I am to speak what I do know. " +
"You all did love him once, not without cause: " +
"What cause withholds you then, to mourn for him? " +
"O judgment! thou art fled to brutish beasts, " +
"And men have lost their reason. Bear with me; " +
"My heart is in the coffin there with Caesar, " +
"And I must pause till it come back to me.");
        
      
        RenderEngine.setSkybox(new Skybox(Cubemap.get(Resource.getTexturePath("skybox\\majestic")), 1500f));        
    }
    
    @Override
    public void render() {
        ShaderController.setPerspective(90, OpenGG.window.getRatio(), 0.2f, 3000f);
    }
    
    @Override
    public void update() {
        MessageBox.update();
    }
    
}
