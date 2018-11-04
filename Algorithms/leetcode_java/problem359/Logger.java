package leetcode_java.problem359;

import java.util.Map;
import java.util.HashMap;

class Logger {

    /** Initialize your data structure here. */
    private Map<String, Integer> logs;
    
    public Logger() {
        logs = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!logs.containsKey(message) || timestamp - logs.get(message) >= 10){
            logs.put(message, timestamp);
            return true;
        }
        return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */