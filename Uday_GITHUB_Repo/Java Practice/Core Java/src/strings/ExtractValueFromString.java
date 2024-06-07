package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractValueFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //String s = "/deviceType=null&os=null&isNewRedirectUrlForWeb=true&vid=vlc0G3UCb3%2B9exF3Y7zgRdTtDWE5NY44Kl18xuC0WcKEbz8N%2B3hGcItHHVvInVkj&hpt=MJQTlGqYUb2OsHJ1G55AfzSPOi1x25V6rjAVWMdtwxs29OSTIJIJf2qZVLf%2BIrsA&orderBarcode=100917725259";
	   //String vid = s.substring(s.lastIndexOf("vid="));
	   //System.out.println(vid);
		String s = "/deviceType=null&os=null&isNewRedirectUrlForWeb=true&vid=vlc0G3UCb3%2B9exF3Y7zgRdTtDWE5NY44Kl18xuC0WcKEbz8N%2B3hGcItHHVvInVkj&hpt=MJQTlGqYUb2OsHJ1G55AfzSPOi1x25V6rjAVWMdtwxs29OSTIJIJf2qZVLf%2BIrsA&orderBarcode=100917725259";

		s = s.substring(s.indexOf("vid=") + 4);
		s = s.substring(0, s.indexOf("&hpt"));

		System.out.println(s);
	}

}
