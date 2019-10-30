package house;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class House {
	private int identification;
	private float price;
	private String location;
	private String advertiser;
	private Photo image;
	
	public House()
	{
		identification=0;
		price=0;
		location="";
		advertiser="";
		image=null;
	}
	public House(int id,float pr, String loc, String ad, Photo img)
	{
		identification = id;
		price = pr;
		location = loc;
		advertiser = ad;
		img = new Photo();
	}
	

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int id) {
		identification = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float pr) {
		price = pr;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String loc) {
		location = loc;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String ad) {
		advertiser = ad;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo img) {
		image = img;
	}


	@Override
	public String toString() {
		return "House [identification=" + identification + ", price=" + price + ", location=" + location
				+ ", advertiser=" + advertiser + "length="+image.getLength()+ ", width"+image.getWidth()+"]";
	}
	
	public void store(House house) { 
		try {
			FileWriter  fobj = new FileWriter("Housing.txt",true);
			fobj.write(identification +"");
			fobj.write(price + "");
			fobj.write(location + "");
			fobj.write(advertiser + "" );
			fobj.write(image + "photoobj");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
		
	
}

