package com.tka;

public class Restaurant {
	

	        static int restaurantId;
	        static String restaurant_name = "Food Palace";
	        static String owner_name = "Rahul Sharma";
	        static String chef_name;
	        static int customerId = 1324;
	        static String customer_name = "Rohan Mane";
	        static int table_no = 15;
	        static int order_no = 245;
	        static String food_item = "Paneer Biryani";
	        static String food_category = "Main Course";
	        static int quantity = 2;
	        static double price;
	        static double total_bill = 501.00;
	        static String payment_method = "UPI";
	        static long phoneNumber;
	        static boolean parkingAvailable;

	        public static void main(String args[]) {
	        System.out.println( restaurantId);
	        System.out.println("Restaurant Name : " + restaurant_name);
	        System.out.println("Owner Name : " + owner_name);
	        System.out.println( chef_name);
	        System.out.println("Customer ID : " + customerId);
	        System.out.println("Customer Name : " + customer_name);
	        System.out.println("Table Number : " + table_no);
	        System.out.println("Order Number : " + order_no);
	        System.out.println("Food Item : " + food_item);
	        System.out.println("Food Category : " + food_category);
	        System.out.println("Quantity : " + quantity);
	        System.out.println(price);
	        System.out.println("Total Bill : " + total_bill);
	        System.out.println("Payment Method : " + payment_method);
	        System.out.println(phoneNumber);
	        System.out.println(parkingAvailable);
	        
	    }

}
