import java.awt.Rectangle;

public class OtherFile {
  public static void alterPointer2(Rectangle r)
	{	System.out.println("In method alterPointer. r " + r + "\n");
		r = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r + "\n");
	}
	
	public static void alterPointer3(Rectangle r)
	{	System.out.println("In method alterPointer3. r " + r + "\n");
		r = new Rectangle(15, 110, 30, 35);
		System.out.println("In method alterPointer3. r " + r + "\n");
	}
	
	public static void alterPointer4(Rectangle r)
	{	System.out.println("In method alterPointer3. r " + r + "\n");
		r = new Rectangle(15, 110, 30, 35);
		System.out.println("In method alterPointer3. r " + r + "\n");
	}
}
