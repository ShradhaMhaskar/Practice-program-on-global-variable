package com.tka;

public class Mobile {
	

	       static int mobileId = 101;
	       static String brand_name = "Samsung";
	       static String model_name = "Galaxy S24";
	       static String color;
	       static int ram = 8;
	       static int storage = 256;
	       static double screen_size = 6.2;
	       static double battery_capacity = 4000;
	       static String processor = "Snapdragon";
	       static int camera;
	       static double price = 74999.99;
	       static String operating_system = "Android";
	       static String network_type = "5G";
	       static float rating;
	       static long imei_number;

	        public static void main(String args[]) {
	        System.out.println("Mobile ID : " + mobileId);
	        System.out.println("Brand Name : " + brand_name);
	        System.out.println("Model Name : " + model_name);
	        System.out.println(color);
	        System.out.println("RAM : " + ram + " GB");
	        System.out.println("Storage : " + storage + " GB");
	        System.out.println("Screen Size : " + screen_size);
	        System.out.println("Battery Capacity : " + battery_capacity);
	        System.out.println("Processor : " + processor);
	        System.out.println(camera + " MP");
	        System.out.println("Price : " + price);
	        System.out.println("Operating System : " + operating_system);
	        System.out.println("Network Type : " + network_type);
	        System.out.println(rating);
	        System.out.println(imei_number);
	    }


}
