
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
	public void GetCharCount(Integer numCount, Integer letterCount, Integer punCount)
	{
		numCount = 0;
		letterCount = 0;
		punCount = 0;
		for(int i = 0; i < mBaseString.length(); ++i)
		{
			if(mBaseString.charAt(i) >= '0' && mBaseString.charAt(i) <= '9')
			{
				++numCount;
				continue;
			}
			if(mBaseString.charAt(i) >= 'a' && mBaseString.charAt(i) <= 'z'
					|| mBaseString.charAt(i) >= 'A' && mBaseString.charAt(i) <= 'Z')
			{
				++letterCount;
				continue;
			}
			++punCount;
		}
	}
}
