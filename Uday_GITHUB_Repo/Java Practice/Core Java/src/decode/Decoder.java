package decode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Decoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String url = "https%3A%2F%2Fmywebsite%2Fdocs%2Fenglish%2Fsite%2Fmybook.do" +
	               "%3Frequest_type%3D%26type%3Dprivate";
		String result = java.net.URLDecoder.decode(url, StandardCharsets.UTF_8.name());
		System.out.println(result);
	}

}
