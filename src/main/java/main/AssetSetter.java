package main.java.main;

import main.java.object.OBJ_Chest;
import main.java.object.OBJ_Door;
import main.java.object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 120 * gp.tileSize;
        gp.obj[0].worldY = 60 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 50 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 45 * gp.tileSize;
        gp.obj[2].worldY = 105 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 63 * gp.tileSize;
        gp.obj[3].worldY = 101 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 87 * gp.tileSize;
        gp.obj[4].worldY = 96 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 104 * gp.tileSize;
        gp.obj[5].worldY = 99 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 104 * gp.tileSize;
        gp.obj[6].worldY = 93 * gp.tileSize;
    }
}
