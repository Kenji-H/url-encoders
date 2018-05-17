import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URLEncoder;

class Encoder {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println(URLEncoder.encode(br.readLine(), "UTF-8"));
    }
}
