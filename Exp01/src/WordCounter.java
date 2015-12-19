
public class WordCounter {
	String mBaseString;
	public WordCounter(String inputString)
	{
		mBaseString = inputString;
	}
	public String[] GetWords()
	{
		String regex = "[\\s\\d\\p{Punct}]+";
		return mBaseString.split(regex);
	}
	public int GetWordCount()
	{
		String regex = "[\\s\\d\\p{Punct}]+";
		return mBaseString.split(regex).length;
	}
	public int GetNumCount()
	{
		int count = 0;
		for(int i = 0; i < mBaseString.length(); ++i)
			if(mBaseString.charAt(i) >= '0' && mBaseString.charAt(i) <= '9')
				++count;
		return count;

	}
	public int GetLetterCount()
	{
		int count = 0;
		for(int i = 0; i < mBaseString.length(); ++i)
		if(mBaseString.charAt(i) >= 'a' && mBaseString.charAt(i) <= 'z'
				|| mBaseString.charAt(i) >= 'A' && mBaseString.charAt(i) <= 'Z')
			++count;
		return count;

	}
	public int GetPunCount()
	{
		int count = 0;
		for(int i = 0; i < mBaseString.length(); ++i)
		if(!(mBaseString.charAt(i) >= 'a' && mBaseString.charAt(i) <= 'z'
				|| mBaseString.charAt(i) >= 'A' && mBaseString.charAt(i) <= 'Z'
				|| mBaseString.charAt(i) >= '0' && mBaseString.charAt(i) <= '9'))
			++count;
		return count;
	}
}
