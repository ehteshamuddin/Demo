package javaBasics;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String jsonFilePath = "C:\\Users\\Dell\\eclipse-workspace\\Demo\\src\\config\\JsonTest.json";

		
		try {
            // Create an ObjectMapper to parse JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON data from the file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Assuming the JSON is an array with a single object, you can access it directly
            JsonNode jsonObject = rootNode.get(0);

            // Iterate through the fields in the object
            jsonObject.fields().forEachRemaining(entry -> {
                String fieldName = entry.getKey();
                JsonNode fieldValue = entry.getValue();

                // Print the field name and its value
                System.out.println(fieldName + ": " + fieldValue);
            });
        } catch (IOException e) {
            System.out.println("IOException get Caugh "+e);
        }
    }
}
