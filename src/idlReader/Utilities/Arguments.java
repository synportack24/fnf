package idlReader.Utilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrew on 12/20/15.
 */
public class Arguments {

    private static Map<String, String> arguments;


    public static void Parse(String[] args){
        arguments = new HashMap<>();

        for(String str : args){
            String setting = "";
            String value = "true";

            int pos = str.indexOf("=");
            if(pos != -1){
                setting = str.substring(0,pos).toLowerCase();
                value = str.substring(pos + 1).toLowerCase();
            }

            if(arguments.containsKey(setting) == false){
                arguments.put(setting, value);
            }
        }

    }

    public static Boolean CheckArguments(){
        return true;
    }

}
