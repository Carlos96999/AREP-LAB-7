package edu.escuelaing.arep;
import edu.escuelaing.arep.ConvertirGrados;
import org.json.simple.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class App 
{
	public static ConvertirGrados convertir = new ConvertirGrados();
	
	public static void main(String[] args) 
	{
		staticFileLocation("/static");
        port(getPort());
        get("/celsius", (req, res) -> celsius(req, res));
        get("/", (req, res) -> {res.redirect("index.html"); return "";});
    }
        
    private static Object celsius(Request request, Response response) 
    {
        Double value = Double.valueOf(request.queryParams("value"));
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "Convertir grados Fahrenheit a grados Celsius");
        myObject.put("input", value);
        myObject.put("output", convertir.celsius(value));
        return myObject;
    }
    
    public static int getPort()
    {
        if (System.getenv("PORT") != null) 
        {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
