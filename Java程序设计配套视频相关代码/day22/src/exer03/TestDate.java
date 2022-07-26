package exer03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	@Test
	public void test() {

		String name = "΅¤Αυμ»ΔΘ΅¤ΑυΞ¨·Ό΅¤Αυ«hu΅¤ΑυΠΐ¶ω΅¤ΑυΏ£φ©΅¤Αυ¶΅έΥ΅¤ΑυÒτΣ±΅¤ΑυΎ²Οώ΅¤Αυ½υζ―΅¤ΑυΥΡέζ΅¤ΑυΚιΤΖ΅¤Αυµ¤ξΪ΅¤ΑυΊ­Ρώ΅¤Αυ³ΏΠ½΅¤ΑυΣπΝ―΅¤ΑυάΗΣΖ΅¤ΑυζΜ³Ώ΅¤ΑυιΘέ½΅¤Αυ³―ΣΆ΅¤ΑυΡοΗΩ΅¤ΑυΔϋΜΞ΅¤Αυ»άÒ»΅¤ΑυέΌζ¥΅¤ΑυκΐΘΨ΅¤Αυ³ώΊι΅¤ΑυέΥμ΅¤Αυή±Ί­΅¤ΑυΊιε·΅¤ΑυΣρΗΫ΅¤Αυζ­θχ΅¤ΑυΙΠή±΅¤Αυ DΉη΅¤ΑυuζΜ΅¤ΑυΚ©ΌΞ΅¤Αυ»ΫΈΣ΅¤ΑυΗΩΠΔ΅¤ΑυΐΩΡ©΅¤ΑυÒοΊ­΅¤ΑυÒτΓΞ΅¤ΑυÒδΌΞ΅¤ΑυΣώΊ―΅¤ΑυÒΐΤΒ΅¤Αυθ΄Πΐ΅¤ΑυΑΥΐΩ΅¤ΑυιπΞΔ΅¤ΑυÒΑαΙ΅¤Αυ¶¬¬B΅¤ΑυμΟ·²΅¤ΑυΐφΦ¦΅¤ΑυΊΙΘ½΅¤ΑυΓΞάη΅¤ΑυΘΩΔΘ΅¤Αυΐώ•c΅¤Αυθ¤Θ»΅¤ΑυΘτΓτ΅¤ΑυΔ½Ξυ΅¤ΑυΗηΤΒ΅¤Αυ³ΏΞΆ΅¤ΑυΣρΘη΅¤ΑυΙΨζΓ";

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == '΅¤') {
				System.out.print("\",");
				System.out.println();
				System.out.print("\"");
				continue;
			}
			System.out.print(name.charAt(i));
		}
		System.out.println("\"");

	}

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String time = "1983-9-23 23:34:12";

		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(sdf.format(date));
	}
}
