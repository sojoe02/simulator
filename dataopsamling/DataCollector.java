/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataopsamling;

import java.lang.*;
import java.util.*;

/**
 *
 * @author japper
 */
public abstract class DataCollector {

    public static Map<String, Object> eventMap;

    public DataCollector(Object object) {
	eventMap = new HashMap<String, Object>();
    }

    public void addEvent(String hashID, Object object) {
	eventMap.put(hashID, object);
    }

    public abstract double getEventTime(String hashID) ;
	


    public abstract Object getEventHappening(String hashID);

}


