
package models;

public class Line {
    private String s;

    public Line(String s) {
        this.s = s;
    }
    
    public Line() {
        s = "";
    }
    
    public void addString(String s) {
        this.s = this.s + " " + s;
    }
    
    public String getChar(int index) {
        return String.valueOf(s.charAt(index));
    }

    public String get() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }    
}
