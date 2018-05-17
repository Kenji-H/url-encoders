import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URLDecoder;

class Decoder {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println(URLDecoder.decode(br.readLine(), "UTF-8"));
    }
}
