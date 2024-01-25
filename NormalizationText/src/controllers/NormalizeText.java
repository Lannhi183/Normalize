
package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import models.Line;
import models.Text;

public class NormalizeText {
    Text t;
    Line preLine = new Line();
    Line l;
    public NormalizeText(String pathName) {
        t = new Text();
        readFile(pathName);
    }
    
    
    
    private void readFile(String pathName){
        
        try {
            FileReader fr = new FileReader(pathName);
            BufferedReader br = new BufferedReader(fr);
            l = new Line(br.readLine().trim());
//            while (!l.get().equals(null)) {                
                l = correct(l);
                System.out.println(l);
                t.addContent(l);
//                l = new Line(br.readLine().trim());
//            }
        } catch (Exception e) {
        }
    }
       
    private Line correct(Line l) {
        l = nomalizeSpace(l);
        l = nomalizeUpperCase(l);
        return l;
    }
    
    private Line nomalizeSpace(Line l) {
        String current, pre;
        current = pre = l.getChar(0);
        System.out.println(current);
        
        for (int i = 1; i < l.get().length(); i++) {
            current = l.getChar(i);
            
            if (current.equals(pre) && pre.equals(" ")) {
                l = new Line(removeCharAt(l.get(), i));
                i--;
            } else {
                pre = current;
            }         
        }
        return l;
    }
    
    private Line nomalizeUpperCase(Line l) {
        if (preLine.get().equals("")) {
            String temp = l.getChar(0).replace(l.getChar(0), l.getChar(0).toUpperCase());
            System.out.println(temp);
            l.getChar(0) = temp;
            preLine = l;
            
        } else {
        }
        
        return l;
    }
    
    public void viewFile() {
        System.out.println(t);
    }
    
    private String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
}
