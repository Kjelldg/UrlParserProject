package parsers;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryParser {

	// Returns a hashmap of keys and corresponding values.
	public Map<String, String> queryParserMap(String query) {

		String searchPattern = "\\b([^\\&]+)=([^\\&]+)\\b";

		Pattern pattern = Pattern.compile(searchPattern);
		Matcher matcher = pattern.matcher(query);

		Map<String, String> queryMap = new HashMap<>();

		while (matcher.find()) {
			queryMap.put(matcher.group(1), matcher.group(2));
		}

		return queryMap;
	}

}
