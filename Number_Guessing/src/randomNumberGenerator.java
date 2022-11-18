//How to generate Random Number
//https://www.educative.io/answers/how-to-generate-random-numbers-in-java

public class randomNumberGenerator {
    private int min = 1, max = 100;
     
    public int generate()
    {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}
