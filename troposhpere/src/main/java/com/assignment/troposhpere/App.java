package com.assignment.troposhpere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;

public class App {

	private static String fee_name = "";
	private static int fee_type = 0;
	private static int nationality_type = 0;
	private static String nationality_name = "";
	private static int course_type;
	private static int course_level;
	private static String course_name;

	public static void main(String[] args) throws IOException {
		// Reading JSON from file system
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\banij\\eclipse-workspace1\\troposhpere\\src\\main\\java\\com\\assignment\\troposphere\\sourceFile\\"
				+ "problem.json"));
		String line;
		StringBuilder sbuilderObj = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sbuilderObj.append(line);
		}

		// Using JSONObject
		JSONObject jsonObj = new JSONObject(sbuilderObj.toString());

		Scanner sc = new Scanner(System.in);

		System.out.println("Select FEE type: ");
		System.out.println(" Press 1 for Exam Fee");
		System.out.println(" Press 2 for Application Fee");
		System.out.print("Enter your choice for Fee type :");
		fee_type = sc.nextInt();
		System.out.print("\n\n\n\n\n\n");

		if (fee_type == 1) {
			fee_name = "Exam Fee";

			System.out.println("Select Nationality :");
			System.out.println(" Press 1 for INDIAN");
			System.out.println(" Press 2 for FOREIGN");
			System.out.println(" Press 3 for NRI");
			System.out.println(" Press 4 for SAARC");
			System.out.print("Enter your choice for Nationality :");
			nationality_type = sc.nextInt();
			System.out.print("\n\n\n\n\n\n");

			if (nationality_type == 1) {

				int res = jsonObj.getJSONObject("Exam Fee").getJSONObject("INDIAN").getJSONObject("ALL_COURSES​")
						.getJSONObject("ALL_LEVEL​").getInt("amount");

				System.out.println("For all the courses of all levels the Exam Fee for Indian is : " + res);
			} else if (nationality_type == 2) {

				int res = jsonObj.getJSONObject("Exam Fee").getJSONObject("FOREIGN").getJSONObject("ALL_COURSES​")
						.getJSONObject("ALL_LEVEL​").getInt("amount");
				System.out.println("For all the courses of all levels the Exam Fee for Foreign is : " + res);
			} else if (nationality_type == 3) {

				int res = jsonObj.getJSONObject("Exam Fee").getJSONObject("NRI").getJSONObject("ALL_COURSES​")
						.getJSONObject("ALL_LEVEL​").getInt("amount");
				System.out.println("For all the courses of all levels the Exam Fee for NRI is : " + res);
			} else if (nationality_type == 4) {

				int res = jsonObj.getJSONObject("Exam Fee").getJSONObject("SAARC").getJSONObject("ALL_COURSES​")
						.getJSONObject("ALL_LEVEL​").getInt("amount");
				System.out.println("For all the courses of all levels the Exam Fee for SAARC is : " + res);
			} else {
				System.out.println("Ohoh!! Wrong selection! Retry with correct choice.");
			}

		}

		else if (fee_type == 2) {
			fee_name = "Application Fee";
			System.out.println("Select Nationality :");
			System.out.println(" Press 1 for INDIAN");
			System.out.println(" Press 2 for FOREIGN");
			System.out.print("Enter your choice for nationality :");
			nationality_type = sc.nextInt();
			System.out.print("\n\n\n\n\n\n");
			if (nationality_type == 1) {
				System.out.println("Select Course :");
				// Dont have entries for courses in JSON, can be implemented when JSON has the
				// entries
				System.out.println("Press 1 for Medical");
				System.out.println("Press 2 for Dental");
				System.out.println("Press 3 for Ayurveda");
				System.out.print("Enter your choice for course type :");
				course_type = sc.nextInt();
				System.out.print("\n\n\n\n\n\n");
				if (course_type == 1) {
					course_name = "Medical";
				}
				if (course_type == 2) {
					course_name = "Dental";
				}
				if (course_type == 3) {
					course_name = "Ayurveda";
				}

				System.out.println("Select Level of course :");
				System.out.println("Press 1 for UG");
				System.out.println("Press 2 for PG");
				System.out.println("Press 3 for DIPLOMA");
				System.out.println("Press 4 for Ph.D");
				System.out.print("Enter your choice for course level:");
				course_level = sc.nextInt();
				System.out.print("\n\n\n\n\n\n");

				if (course_level == 1) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("INDIAN")
							.getJSONObject("ALL_COURSES​").getJSONObject("UG").getInt("amount");
					System.out.println(
							"For " + course_name + "course at UG level the Application Fee for INDIAN is : " + res);
				} else if (course_level == 2) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("INDIAN")
							.getJSONObject("ALL_COURSES​").getJSONObject("PG").getInt("amount");
					System.out.println(
							"For " + course_name + "course at PG level the Application Fee for INDIAN is : " + res);
				} else if (course_level == 3) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("INDIAN")
							.getJSONObject("ALL_COURSES​").getJSONObject("UG-DIPLOMA").getInt("amount");
					System.out.println("For " + course_name
							+ "course at DIPLOMA level the Application Fee for INDIAN is : " + res);
				} else if (course_level == 4) {
					System.out.println(" Ohoh!! we don't yet have Ph.D level for " + course_name + "course");
				} else {
					System.out.println("Ohoh!! Wrong selection! Retry with correct choice.");
				}
			} else if (nationality_type == 2) {
				System.out.println("Select Course :");
				// Dont have entries for courses in JSON, can be implemented when JSON has the
				// entries
				System.out.println("Press 1 for Medical");
				System.out.println("Press 2 for Dental");
				System.out.println("Press 3 for Ayurveda");
				System.out.print("Enter your choice for course type:");
				course_type = sc.nextInt();
				System.out.print("\n\n\n\n\n\n");
				if (course_type == 1) {
					course_name = "Medical";
				}
				if (course_type == 2) {
					course_name = "Dental";
				}
				if (course_type == 3) {
					course_name = "Ayurveda";
				}

				System.out.println("Select Level of course :");
				System.out.println("Press 1 for UG");
				System.out.println("Press 2 for PG");
				System.out.println("Press 3 for DIPLOMA");
				System.out.println("Press 4 for Ph.D");
				System.out.print("Enter your choice for course level :");
				course_level = sc.nextInt();
				System.out.print("\n\n\n\n\n\n");

				if (course_level == 1) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("FOREIGN")
							.getJSONObject("ALL_COURSES​").getJSONObject("UG").getInt("amount");
					System.out.println(
							"For " + course_name + "course at UG level the Application Fee for FOREIGN is : " + res);
				} else if (course_level == 2) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("FOREIGN")
							.getJSONObject("ALL_COURSES​").getJSONObject("PG").getInt("amount");
					System.out.println(
							"For " + course_name + "course at PG level the Application Fee for FOREIGN is : " + res);
				} else if (course_level == 3) {
					int res = jsonObj.getJSONObject("Application Fee").getJSONObject("FOREIGN")
							.getJSONObject("ALL_COURSES​").getJSONObject("UG-DIPLOMA").getInt("amount");
					System.out.println("For " + course_name
							+ "course at DIPLOMA level the Application Fee for FOREIGN is : " + res);
				} else if (course_level == 4) {
					System.out.println(" Ohoh!! we don't yet have Ph.D level for " + course_name + "course");
				} else {
					System.out.println("Ohoh!! Wrong selection! Retry with correct choice.");
				}
			}

		} else {
			System.out.println("Ohoh!! Wrong selection! Retry with correct choice.");
		}
	}
}