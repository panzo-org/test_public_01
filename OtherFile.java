import java.awt.Rectangle;

public class OtherFile {
  public static void alterPointer2(Rectangle r)
	{	System.out.println("In method alterPointer. r " + r + "\n");
		r = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r + "\n");
	}
}
