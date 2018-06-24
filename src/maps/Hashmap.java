package maps;

import parsers.ParserMethods;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public Map<String, String> urlToHashmap(String url) {

		ParserMethods parser = new ParserMethods();

		Map<String, String> urlMap = new HashMap<>();

		urlMap.put("[scheme]", parser.schemeParser(url));
		urlMap.put("[username]", parser.usernameParser(url));
		urlMap.put("[password]", parser.passwordParser(url));
		urlMap.put("[hostname]", parser.hostnameParser(url));
		urlMap.put("[path]", parser.pathParser(url));
		urlMap.put("[query]", parser.argParser(url));
		urlMap.put("[fragment]", parser.anchorParser(url));

		return urlMap;

	}

}
