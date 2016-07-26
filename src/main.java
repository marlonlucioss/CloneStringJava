import info.debatty.java.stringsimilarity.*;

public class main {
	
	static HttpURLConnectionExample http = new HttpURLConnectionExample();
	static Levenshtein levenshtein = new Levenshtein();
	static NormalizedLevenshtein normalizedLevenshtein = new NormalizedLevenshtein();
	static Damerau damerau = new Damerau();
	static JaroWinkler jaroWinkler = new JaroWinkler();
	static LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
	static info.debatty.java.stringsimilarity.MetricLCS lcs = new info.debatty.java.stringsimilarity.MetricLCS();
	static NGram twogram = new NGram(2);
	static QGram dig = new QGram(2);
	
	public static void main(String[] args){
		try {
			
			String str1 = "1111";
			String str2 = "2211";
			
			System.out.println("String Match");
			System.out.println(LetterPairSimilarity.compareStrings(str1,str2));
			
			
			System.out.println("Levenshtein");
	        System.out.println(levenshtein.distance(str1, str2));
	        
	        System.out.println("Normalized Levenshtein");
	        System.out.println(normalizedLevenshtein.distance(str1, str2));
	        
	        System.out.println("Weighted Levenshtein");
	        System.out.println(levenshtein.distance(str1, str2));
	        
	        System.out.println("Damerau-Levenshtein");
	        System.out.println(damerau.distance(str1, str2));
	        
	        System.out.println("Jaro-Winkler");
	        System.out.println(jaroWinkler.similarity(str1, str2));
	        
	        System.out.println("Longest Common Subsequence");
	        System.out.println(longestCommonSubsequence.distance(str1, str2));
	        
	        System.out.println("Metric Longest Common Subsequence");
	        System.out.println(lcs.distance(str1, str2));
	        
	        System.out.println("NGram");
	        System.out.println(twogram.distance(str1, str2));

	        System.out.println("QGram");
	        System.out.println(dig.distance(str1, str2));
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String formatUrl(String url){
		String convertedUrl = url.replace("/blob", "");
	    return convertedUrl.replace("//", "//raw.");
	}
}
