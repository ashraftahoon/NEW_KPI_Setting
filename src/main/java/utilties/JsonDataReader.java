package utilties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.JsonArray;

public class JsonDataReader {
	private String filepath;
	private File srcFile;
   public String username,password,id,title,defntion,formul,O_depart,spoc_de;
   public int year,propose,weight,apply,ambtiuos,score,ambitious_adj;
   
	public    JsonDataReader(String jsonfilepath)
	{
		//String FilePath=System.getProperty("user.dir" + "src/test/java/data/userdata.json");
		filepath=System.getProperty("user.dir") +  jsonfilepath;
		srcFile=new File(filepath);
	
      
       }
	
	public JSONArray getJsonArray() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		return (JSONArray)parser.parse(new FileReader(srcFile));
	}
 }
