
package models;

public class Text {
    String content;

    public Text() {
        content = "";
    }
    
    public void addContent(Line l) {
        content = content + " " + l.toString().trim();
    }

    @Override
    public String toString() {
        return content;
    }
}
