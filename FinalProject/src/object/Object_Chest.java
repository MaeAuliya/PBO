package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Object_Chest extends SuperObject {

public Object_Chest() {
		
		name = "chest";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
	

