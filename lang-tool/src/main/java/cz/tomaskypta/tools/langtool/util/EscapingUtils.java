package cz.tomaskypta.tools.langtool.util;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Created by Tomáš Kypta on 02.10.14.
 */
public class EscapingUtils {

    private static final Pattern escapingPattern = Pattern.compile("([^\\\\]?)('|\")");
    private static final String replacement = "$1\\\\$2";
    
    private static final String[][] postProcessorStrings = {
    		{"¼","&#188;"},
    		{"1/4","&#188;"},
    		{"½","&#189;"},
    		{"1/2","&#189;"},
    		{"¾","&#190;"},
    		{"3/4","&#190;"},
    		{"…","&#8230;"}};    

    public static String escapeWithQuotes(String value) {
        return '"' + value + '"';
    }

    public static String escapeWithBackslash(String value) {
        return escapingPattern.matcher(value).replaceAll(replacement);
    }

    public static String unescapeQuotes(String value) {
        if (value.startsWith("\\\"") && value.endsWith("\\\"")) {
            return value.substring(2, value.length() - 2);
        }
        return value;
    }
    
    public static String postProcessorStrings(String value){    	
    	for (String[] ppstr:postProcessorStrings){
    		value = value.replaceAll(ppstr[0], ppstr[1]);
    	}
    	return value;
    }
}
