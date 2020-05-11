package TM2_Video_Renatl_System;
import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int ch=0;
VideoStore v = new VideoStore();

	do
	{
		
		System.out.println("\n1.Add Video\n2.CHeckOut Video\n3.Return Video \n4.Recive Rating \n5.List Inventory \n6.Exit");;
	String name;
	 ch=s.nextInt();
	 switch(ch) {
	 case 1:
	{
		System.out.println("Enete the Name of the Movie");
		name  = s.next();
		v.addVideo(name);
		break;
	}
	 case 2:
	{
		System.out.println("Enete the Name of the Movie you want to check out");
		name  = s.next();
		v.doCheckout(name);
		System.out.print("Video" + name+" "+ "checkOut");

		break;
	}


	 case 3:
	{
		System.out.println("Enete the Name of the Movie you want to return");
		name  = s.next();
		v.doReturn(name);
		System.out.print("Video" + name+" "+ "return");

		break;
	}
	
	 case 4:
	{
		System.out.println("Enete the Name of the Movie you want toratet");
		name  = s.next();
		int rate = s.nextInt();
		v.reciveRating(name, rate);
		break;
	}
	 case 5:
	{
		v.listInventory();
		break;
	}
	 case 6:
		System.out.print("Exit");
		System.exit(0);
	break;	
	 }
	}while(ch!=6);
		
	}

}
