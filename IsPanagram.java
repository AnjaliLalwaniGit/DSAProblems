package Arrays;

public class IsPanagram {

    public boolean checkIfPangram(String sentence) {
        return sentence.chars().distinct().count()==26;
    }
}
