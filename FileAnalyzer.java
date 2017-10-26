import java.util.PriorityQueue;
public class FileAnalyzer {
    private int lines;
    private int blankLines;
    private int spaces;
    private int words;
    private int avgCharsPerLine;
    private int avgWordLength;
    private PriorityQueue<WordTotal> mostCommonWords;
    private String name;
    private String uuid;
    static int totalFiles = 0;

    public FileAnalyzer()
    {
        lines = 0;
        blankLines = 0;
        spaces = 0;
        words = 0;
        avgCharsPerLine = 0;
        avgWordLength = 0;
        mostCommonWords = null;
        name = "";
    }
    public FileAnalyzer(String inputName)
    {
      lines = 0;
      blankLines = 0;
      spaces = 0;
      words = 0;
      avgCharsPerLine = 0;
      avgWordLength = 0;
      mostCommonWords = null;
      name = inputName;
    }
    public FileAnalyzer(int lC, int bC, int sC, int wC, int aCPL, int aWL, PriorityQueue<WordTotal> p, String filename)
    {
        lines = lC;
        blankLines = bC;
        spaces = sC;
        words = wC;
        avgCharsPerLine = aCPL;
        avgWordLength = aWL;
        mostCommonWords = p;
        name = filename;
    }
    public FileAnalyzer(String[] arrayOfStrings){
      for (int i = 0; i < arrayOfStrings.length; i++) {
        switch(i){
          case 0:
            setUUID(arrayOfStrings[i]);
            break;
          case 1:
            setName(arrayOfStrings[i]);
            break;
          case 2:
            setLines(Integer.parseInt(arrayOfStrings[i]));
            break;
          case 3:
            setBlankLines(Integer.parseInt(arrayOfStrings[i]));
            break;
          case 4:
            setSpaces(Integer.parseInt(arrayOfStrings[i]));
            break;
          case 5:
            setWords(Integer.parseInt(arrayOfStrings[i]));
            break;
          default:
            break;
        }
      }
    }

    public void setUUID(String newUuid){
      uuid = newUuid;
    }
    public String getUUID(){
      return uuid;
    }

    public void setName(String inputName)
    {
      name = inputName;
    }
    public String getName()
    {
      return name;
    }
    public void setLines(int newLines)
    {
        lines = newLines;
    }
    public int getLines()
    {
        return lines;
    }
    public void setBlankLines(int newBlankLines)
    {
        blankLines = newBlankLines;
    }
    public int getBlankLines()
    {
        return blankLines;
    }
    public void setSpaces(int newSpaces)
    {
        spaces = newSpaces;
    }
    public int getSpaces()
    {
        return spaces;
    }
    public void setWords(int newWords)
    {
        words = newWords;
    }
    public int getWords()
    {
        return words;
    }
    public void setAvgCharsPerLine(int newAvg)
    {
        avgCharsPerLine = newAvg;
    }
    public int getAvgCharsPerLine()
    {
        return avgCharsPerLine;
    }
    public void setAvgWordLength(int newAvg)
    {
        avgWordLength = newAvg;
    }
    public int getAvgWordLength()
    {
        return avgWordLength;
    }

    public void setMostCommonWords(PriorityQueue<WordTotal> p)
    {
        mostCommonWords = p;
    }
    public PriorityQueue<WordTotal> getMostCommonWords()
    {
        return mostCommonWords;
    }
}
