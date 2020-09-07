package AppTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonparsing {

public static void main(String[] args) throws IOException, ParseException {
String inline = "";
URL url = new URL(
" https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
conn.setRequestProperty("Accept", "application/json");

if (conn.getResponseCode() != 200) {

throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
}

else {

Scanner sc = new Scanner(url.openStream());
while (sc.hasNext()) {
inline += sc.nextLine();
}
System.out.println("JSON data in string:");
System.out.println(inline);
sc.close();

}
System.out.println(inline);

JSONParser jsonParser = new JSONParser();
JSONObject jsonObject = (JSONObject) jsonParser.parse(inline);

// get a String from the JSON object
String cod = (String) jsonObject.get("cod");
System.out.println("The first name is: " + cod);
}
}