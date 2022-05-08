package objectserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Readobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(FileInputStream fs=new FileInputStream("studyeasy\\vehicle.dat"))
{
	try(ObjectInputStream obj=new ObjectInputStream(fs))
	{
		Vehicle v1=(Vehicle) obj.readObject();
		Vehicle v2=(Vehicle)obj.readObject();
		System.out.println("object 1:"+v1);
		System.out.println("Object 2:"+v2);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
