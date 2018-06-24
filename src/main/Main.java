package main;

import maps.Hashmap;
import parsers.QueryParser;

public class Main {

	public static void main(String[] args) {

		String url = "http://username:password@hostname/path?arg=value&key1=value1&key2=value2#anchor";

		// Class containing the method for parsing the URL above.
		Hashmap urlToHashmap = new Hashmap();

		// Class containing the method for parsing the query above.
		QueryParser queryParser = new QueryParser();

		// Prints the hashmap for the URL above.
		System.out.println(urlToHashmap.urlToHashmap(url));

		// Prints the hashmap for the query using the URL's [query] values.
		System.out.println(queryParser.queryParserMap(urlToHashmap.urlToHashmap(url).get("[query]")));
	}

}
