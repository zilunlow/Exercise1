//Author : LOW ZI LUN

public class Aquarium{

		public int length,width,height;

		public void fillFish(){

			Fish fish1=new Fish();
			//fish1.color="Orange";
			
			fish1.setColor("Orange");
			System.out.println("Many "+fish1.getColor()+" fish here");
			fish1.Swim();


		}


}