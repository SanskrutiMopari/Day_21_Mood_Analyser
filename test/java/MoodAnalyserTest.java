import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser object;

    @BeforeEach
    public void setUp() {
        object = new MoodAnalyser("I am in Sad Mood");
    }

    @Test
    public void moodAnalyser() {

        String ans = object.moodAnalyser();
        Assertions.assertEquals("Sad", ans);
        System.out.println(ans);
    }
}
