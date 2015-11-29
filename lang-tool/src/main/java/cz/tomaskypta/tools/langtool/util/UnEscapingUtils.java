package cz.tomaskypta.tools.langtool.util;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Created by Frédéric Ravetier on 28-11-2015
 */
public class UnEscapingUtils {    

    public static String unEscape(String value) {
    	//return value.replaceAll("\\\\'", "'").replaceAll("\'", "'").replace("\\'", "'").replace("\\\"", "\"");;  
    	return value.replace("\'", "'").replace("\\'", "'").replace("\\\"", "\"");
    }
}

