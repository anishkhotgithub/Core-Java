
package mapdemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{
    public static void main(String[] args) 
    {
        //Map is key,value pairs
        //Map does not have index position
        //It uses keys to fetch and represent values.
        
        Map<String,String> products=new TreeMap<>();
        products.put("p001", "black polo shirt");
        products.put("p002", "blue polo shirt");
        products.put("p001", "duke hat");
        
        //System.out.println(products.get("p001"));
        //System.out.println(products.get("p002"));
        
        Set<String> keys=products.keySet();//p001,p002
        for (String key : keys) 
        {
            System.out.println(products.get(key));
        }
    }
}
