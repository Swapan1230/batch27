package jrout.tutorial.corejava.util;

public enum Days {
    MON("Monday"),TUE("Tuesday"),WED("Wednesday");

    String day = null;

    Days(String val){
        this.day = val;
    }

    public String getValue(){
        return this.day;
    }


}
