package com.DataDrivenTesting.DDT;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONTest {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fis = new FileReader(".\\src\\test\\resources\\CommonData.json");

		JSONParser jsp = new JSONParser();
 
		Object obj = jsp.parse(fis);
		
//		Map map=(JSONObject) obj; //Upcasting 
		
		JSONObject  map=(JSONObject) obj; //typecasating
	
		
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
//		

	}

}
