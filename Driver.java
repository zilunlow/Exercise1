//Author : LOW ZI LUN
public class Driver{

	public static void main(String [] args){
		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo=new Fish();
		nemo.Swim();
		nemo.color="red";
		nemo.Swim();

		Fish dory=new Fish();
		dory.Swim();
		dory.color="Purple";
		dory.Swim();
	}
}