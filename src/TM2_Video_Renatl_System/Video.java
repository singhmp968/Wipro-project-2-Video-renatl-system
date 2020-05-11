package TM2_Video_Renatl_System;

public class Video {
private String videoName;
private boolean checkOut;
private int rating;
String getName()
{
	return videoName;
}

public void doCheckout()
{checkOut = true;
	
}

public void doReturn()
{
	checkOut=false;
}

public void reciveRating(int rating)
{
	this.rating=rating;
}

public int getRating()
{
	return rating;
}
public boolean getCheckout()
{
	return checkOut;
}

public Video(String name)
{
	this.videoName=name;
	
}
}


