import java.awt.Desktop;
import java.net.URI;
public class openYouTube {
    public static void main(String[] args) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/results?search_query=" + "java programming"));;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
