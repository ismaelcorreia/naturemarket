package edu.ucan.naturemarket.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public class DataUtil {
    
    public static HashMap<String, Object> toMetaData(InputStream stream) {
        if (stream == null)  return null;
        
        Scanner scanner = new Scanner(stream);
        var metaData = new HashMap<String, Object>();
        while(scanner.hasNext()){
            String[] data = scanner.next().split("&");
            for(String elm: data) {
                String[] input = elm.split("=");
                metaData.put(input[0], input[1]);
            }
            
        }
        return metaData;
    }
}
