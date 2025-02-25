import java.util.ArrayList;

public class FirstElement {
    public static String getFirstElement(ArrayList<String> list) {
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return "";
        }
    }
}