package engineTester;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import entities.Camera;
import entities.Entity;
import entities.Light;
import entities.Player;
import guis.GuiRenderer;
import guis.GuiTexture;
import models.RawModel;
import models.TexturedModel;
import objConverter.ModelData;
import objConverter.OBJFileLoader;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.MasterRenderer;
import renderEngine.OBJLoader;
import renderEngine.EntityRenderer;
import shaders.StaticShader;
import terrains.Terrain;
import textures.ModelTexture;
import textures.TerrainTexture;
import textures.TerrainTexturePack;
import toolbox.MousePicker;
import water.WaterFrameBuffers;
import water.WaterRenderer;
import water.WaterShader;
import water.WaterTile;

public class MainGameLoop {
	public static void main(String[] args) {
        DisplayManager.createDisplay();
        Loader loader = new Loader();
                
       //*******************TERRAIN TEXTURE STUFF***********************\\
        
        TerrainTexture backgroundTexture = new TerrainTexture(loader.loadTexture("grassy3"));
        TerrainTexture rTexture = new TerrainTexture(loader.loadTexture("mud"));
        TerrainTexture gTexture = new TerrainTexture(loader.loadTexture("pinkFlowers"));
        TerrainTexture bTexture = new TerrainTexture(loader.loadTexture("mossPath256"));
        
        TerrainTexturePack texturePack = new TerrainTexturePack(backgroundTexture, rTexture, gTexture , bTexture);
        
        TerrainTexture blendMap = new TerrainTexture(loader.loadTexture("blendMap"));
        
        //******************************************************************\\
        
        RawModel model = OBJLoader.loadObjModel("tree", loader);
        
        ModelTexture fernTextureAtlas = new ModelTexture(loader.loadTexture("fern"));
        fernTextureAtlas.setNumberOfRows(2);
        TexturedModel fern = new TexturedModel(OBJLoader.loadObjModel("fern", loader),fernTextureAtlas);
        
             
        TexturedModel staticModel = new TexturedModel(model, new ModelTexture(loader.loadTexture("tree")));
        TexturedModel grass = new TexturedModel(OBJLoader.loadObjModel("grassModel", loader),
        		new ModelTexture(loader.loadTexture("grassTexture")));
        TexturedModel flower = new TexturedModel(OBJLoader.loadObjModel("grassModel", loader),
        	
        		
        		new ModelTexture(loader.loadTexture("flower")));
        //TexturedModel fern = new TexturedModel(OBJLoader.loadObjModel("grassModel", loader),new ModelTexture(loader.loadTexture("fern")));
        
        
        TexturedModel bobble = new TexturedModel(OBJLoader.loadObjModel("lowPolyTree", loader),
        		new ModelTexture(loader.loadTexture("lowPolyTree")));
        TexturedModel box = new TexturedModel(OBJLoader.loadObjModel("box", loader),
        		new ModelTexture(loader.loadTexture("box")));
        TexturedModel box2 = new TexturedModel(OBJLoader.loadObjModel("box", loader),
        		new ModelTexture(loader.loadTexture("box")));
        grass.getTexture().setHasTransparency(true);
        grass.getTexture().setUseFakeLighting(true);
        flower.getTexture().setHasTransparency(true);
        flower.getTexture().setUseFakeLighting(true);
        fern.getTexture().setHasTransparency(true);
        
        //I TRY
        TexturedModel daisy = new TexturedModel(OBJLoader.loadObjModel("grassModel", loader),
        		new ModelTexture(loader.loadTexture("daisy")));
        daisy.getTexture().setHasTransparency(true);
        daisy.getTexture().setUseFakeLighting(true);
        
        List<Terrain> terrains = new ArrayList<Terrain>();
        Terrain terrain = new Terrain(0,-1,loader,texturePack, blendMap, "heightmap");
        Terrain terrain2 = new Terrain(1,0,loader,texturePack, blendMap, "heightmap");
        terrains.add(terrain);
        terrains.add(terrain2); 
        
        List<Entity> entities = new ArrayList<Entity>();
        Random random = new Random(676452);
        for(int i=0;i<400;i++){
            if(i % 20 ==0){
            	float x = random.nextFloat() * 800 -400;
            	float z = random.nextFloat() * -600;
            	float y = terrain.getHeightOfTerrain(x, z);
            	
            	entities.add(new Entity(fern,random.nextInt(4),new Vector3f(x,y,z),0,random.nextFloat(),0,0.9f));
            	
            	entities.add(new Entity(grass, new Vector3f(random.nextFloat()*400-200,0,
            			random.nextFloat() * -400),0,0,0,1.8f));
            	entities.add(new Entity(flower, new Vector3f(random.nextFloat()*400-200,0,
            			random.nextFloat() * -400),0,0,0,2.3f));
            }
            if(i % 5 == 0){
            	float x = random.nextFloat() * 800 -400;
            	float z = random.nextFloat() * -600;
            	float y = terrain.getHeightOfTerrain(x, z);
            	
            	entities.add(new Entity(fern, new Vector3f(random.nextFloat()*400-200,0,
            			random.nextFloat() * -400),0,random.nextFloat() * 360,0,0.9f));
            	entities.add(new Entity(bobble, new Vector3f(random.nextFloat()*800-400,0,
            			random.nextFloat() * -600),0,random.nextFloat() * 360,0,random.nextFloat() * 0.1f + 0.6f));
            	
            	 x = random.nextFloat() * 800 -400;
            	 z = random.nextFloat() * -600;
            	 y = terrain.getHeightOfTerrain(x, z);
            	
            	entities.add(new Entity(staticModel, new Vector3f(random.nextFloat()*800-400,0,
            			random.nextFloat() * -600),0,0,0,random.nextFloat() * 1 + 4));
            	entities.add(new Entity(daisy, new Vector3f(random.nextFloat()*400-200,0,
            			random.nextFloat() * -400),0,0,0,1.3f));
            }
        }
         
        Light light = new Light(new Vector3f(0,10000,-7000),new Vector3f(1,1,1));
        List<Light> lights = new ArrayList<Light>();
        lights.add(light);
        lights.add(new Light(new Vector3f(0,1000,-7000),new Vector3f(0.4f,0.4f,0.4f)));
        lights.add(new Light(new Vector3f(185,10,-293),new Vector3f(2,0,0),new Vector3f(1,0.01f,0.002f)));
        lights.add(new Light(new Vector3f(370,17,-300),new Vector3f(0,2,2),new Vector3f(1,0.01f,0.002f)));
        lights.add(new Light(new Vector3f(293,7,-305),new Vector3f(2,2,0),new Vector3f(1,0.01f,0.002f)));
        
        TexturedModel lamp = new TexturedModel(OBJLoader.loadObjModel("lamp", loader),
        		new ModelTexture(loader.loadTexture("lamp")));
        
        entities.add(new Entity(lamp, new Vector3f(185,-4.7f,-293),0,0,0,1));
        entities.add(new Entity(lamp, new Vector3f(370,4.2f,-300),0,0,0,1));
        entities.add(new Entity(lamp, new Vector3f(293,-6.8f,-305),0,0,0,1));
        
            
        MasterRenderer renderer = new MasterRenderer(loader);
        
        RawModel bunnyModel = OBJLoader.loadObjModel("person", loader);
        TexturedModel stanfordBunny = new TexturedModel(bunnyModel, new ModelTexture(loader.loadTexture("playerTexture")));
        
        Entity boxEntity = new Entity(box, new Vector3f(255.5f,5,-352.6f),0f,25f,0f,5f);
        
        Player player = new Player(stanfordBunny,new Vector3f(100,5,-150),0,180,0,0.6f);
        Camera camera = new Camera(player);
        
        List<GuiTexture> guiTextures = new ArrayList<GuiTexture>();
       
        GuiTexture gui = new GuiTexture(loader.loadTexture("health"),new Vector2f(-0.7f,-0.7f),new Vector2f(0.25f,0.25f));
        GuiTexture gui2 = new GuiTexture(loader.loadTexture("kory1905"),new Vector2f(-0.4f,-0.75f),new Vector2f(0.13f,0.13f));
        guiTextures.add(gui);
        guiTextures.add(gui2);
        
        GuiRenderer guiRenderer = new GuiRenderer(loader);
        
        MousePicker picker = new MousePicker(camera, renderer.getProjectionMatrix(),terrain);
        Entity lampEntity = (new Entity(lamp,new Vector3f(293,-6.8f,-305),0,0,0,1));
        Light light3 = (new Light(new Vector3f(293,7,-305),new Vector3f(0,2,2),new Vector3f(1,0.01f,0.002f)));
        lights.add(light3);
        
        WaterShader waterShader = new WaterShader();
        WaterRenderer waterRenderer = new WaterRenderer(loader, waterShader, renderer.getProjectionMatrix());
        List<WaterTile> waters = new ArrayList<WaterTile>();
        waters.add(new WaterTile(75,-75,0));
        
        WaterFrameBuffers buffers = new WaterFrameBuffers();
        GuiTexture refraction = new GuiTexture(buffers.getRefractionTexture(), new Vector2f(0.5f,0.5f), new Vector2f(0.25f,0.25f));
        GuiTexture reflection = new GuiTexture(buffers.getReflectionTexture(), new Vector2f(0.5f,0.5f), new Vector2f(0.25f,0.25f));
        
        guiTextures.add(refraction);
        guiTextures.add(reflection);
         
        while(!Display.isCloseRequested()){
        	player.move(terrain);
            camera.move();
            
            picker.update();
            
            GL11.glEnable(GL30.GL_CLIP_DISTANCE0);
            
            //render reflection texture
            buffers.bindReflectionFrameBuffer();
            renderer.renderScene(entities, terrains, lights, camera, new Vector4f(0,-1,0,15));
   
            //render refraction texture
            buffers.bindRefractionFrameBuffer();
            renderer.renderScene(entities, terrains, lights, camera,new Vector4f(0,-1,0,15));
            
            buffers.unbindCurrentFrameBuffer();
            renderer.renderScene(entities, terrains, lights, camera,new Vector4f(0,-1,0,15));
            waterRenderer.render(waters, camera);    
            guiRenderer.render(guiTextures);
            
            DisplayManager.updateDisplay();
        }
        //************Clean UP************************\\
        waterShader.cleanUp();
        guiRenderer.cleanUp();
        renderer.cleanUp();
        loader.cleanUp();
        DisplayManager.closeDisplay();
 
    }
}
