package com.tka;

public class Hospital {
	
		static int hospitalId;
		static String hos_name = "Navjivan Hospital";
		static String doc_name = "Sanjay Mane";
		static String patient_name = "Rohan Patil";
		static int patientId = 1324;
		static int age = 30;
		static char gender;
		static int dept_number = 5;
		static int room_no = 25;
		static int bed_no = 243;
		static String blood_group = "A+";
		static String AddmissionDate;
		static double doc_Fees;
		static long phoneNumber = 7652454134l;
		
		public static void main(String arge[]) {
		System.out.println(hospitalId);
		System.out.println("Hospital Name : " + hos_name);
		System.out.println("Doctor Name : " + doc_name);
		System.out.println("Patient Name : " + patient_name);
		System.out.println("Patient ID : " + patientId);
		System.out.println("Age : " + age);
		System.out.println(gender);
		System.out.println("Department Number : " + dept_number);
		System.out.println("Room Number : " + room_no);
		System.out.println("Bed Number : " + bed_no);
		System.out.println("Blood Group : " + blood_group);
		System.out.println(AddmissionDate);
		System.out.println(doc_Fees);
		System.out.println("Contact Number : " + phoneNumber);

	}

}
