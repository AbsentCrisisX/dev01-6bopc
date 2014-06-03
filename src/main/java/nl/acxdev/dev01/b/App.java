package nl.acxdev.dev01.b;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( getHello() );
        System.out.println( getWebText() );
    }
    
    public static String getHello(){
        return "Hello world!";
    }
    
    public static String getWebText(){
        try {
            Document doc = Jsoup.connect("http://www.acxdev.nl/text.html").get();
            Element text = doc.select("p").first();
            return text.html();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
