package parsers;

public class ParserMethods {

	// http://username:password@hostname/path?arg=value#anchor

	// Returns http ([scheme])
	public String schemeParser(String url) {

		String schemeParsed = url.replaceAll("\\:.*", "");

		return schemeParsed;
	}

	// Returns the username ([username])
	public String usernameParser(String url) {

		String usernameParsed = url.replaceAll(".*\\//|\\:.*", "");

		return usernameParsed;
	}

	// Returns the password ([password])
	public String passwordParser(String url) {

		String passwordParsed = url.replaceAll(".*\\:|\\@.*", "");

		return passwordParsed;
	}

	// Returns the hostname ([hostname])
	public String hostnameParser(String url) {

		String hostnameParsed = url.replaceAll(".*\\@|\\/.*", "");

		return hostnameParsed;
	}

	// Returns the path ([path])
	public String pathParser(String url) {

		String pathParsed = url.replaceAll(".*\\/|\\?.*", "");

		return "/" + pathParsed;
	}

	// Returns the arg=value ([query])
	public String argParser(String url) {

		String argParsed = url.replaceAll(".*\\?|\\#.*", "");

		return argParsed;
	}

	// Returns the anchor ([fragment])
	public String anchorParser(String url) {

		String anchorParsed = url.replaceAll(".*\\#", "");

		return anchorParsed;
	}

}