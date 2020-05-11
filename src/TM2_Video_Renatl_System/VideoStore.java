package TM2_Video_Renatl_System;

public class VideoStore  {

	

Video store[];
public VideoStore() {
	store = new Video[10];
}
 	int i=0;
public void addVideo(String name)
{
//	int storeSize;
//	try {
//		storeSize = store.length;
//	} catch (Exception e) {
//		storeSize = 0;
//	}
////store[i] = new Video(name);
////i++;
//	
//	Video[] newStore = new Video[storeSize + 1];
//	newStore[storeSize] = video;
//	store = newStore;

store[0]=new Video(name);
System.out.print("Video" + store[0].getName()+""+ "added");
}

public void doCheckout(String name)
{
if(store==null||store.length == 0) {
	System.out.print("No Movie is Avilable");
	return;
}
//for(Video v: store)
//{
//	if(v.getName().equals(name))
//	
//	{
//	v.doCheckout();	
//	
//	}
if(store[0].getName().equals(name))
{
	store[0].doCheckout();
}
}
public void doReturn(String name)
{
if(store==null||store.length==0)
{
	System.out.print("No Movie Avilabel");
	return;
}
//for(Video v : store)
//{
//	if(v.getName().equals(name))
//	{
//		v.doReturn();
//		
//	}

if(store[0].getName().equals(name))
{
	store[0].doReturn();
}
}

public void reciveRating(String name,int rating)
{
if(store==null|| store.length==0)
{
System.out.print("No Movie Avilabel");
return;
}
//for(Video v:store)
//{
//if(v.getName().equals(name))
//{
//	v.reciveRating(rating);
//	
//}
//}
if(store[0].getName().equals(name))
{
	store[0].reciveRating(rating);
}
}

public void listInventory()
{
if(store.length==0 || store==null)
{
	System.out.print("No Movie Avilabel");
	return;
}	
System.out.println("------------------------------------------------");
System.out.println("\tName\t|" + "\tRating\t|" + "\tCheackOut\t");

System.out.println("\t"+store[0].getName()+ "\t|\t"+store[0].getRating()+"\t|\t"+store[0].getCheckout());
System.out.println("------------------------------------------------");
}
}



	

