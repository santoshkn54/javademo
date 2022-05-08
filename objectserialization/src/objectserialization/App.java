package objectserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class App  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Vehicle("bike", 464987);
		Vehicle car = new Vehicle("car", 789416);
		try(FileOutputStream fs=new FileOutputStream("studyeasy\\vehicle.dat"))
		{
			try(ObjectOutputStream obj=new ObjectOutputStream(fs))
			{
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written on to the file");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
