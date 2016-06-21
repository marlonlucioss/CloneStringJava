public class main {
	
	public static void main(String[] args){
		try {
			System.out.println(LetterPairSimilarity.compareStrings(args[0],args[1]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
