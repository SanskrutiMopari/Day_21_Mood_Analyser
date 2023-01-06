import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser object;

    @BeforeEach
    public void setUp() {
        object = new MoodAnalyser("I am in Happy Mood");
    }

    @Test
    public void moodAnalyser() {

        String ans = object.moodAnalyser();
        Assertions.assertEquals("Happy", ans);
        System.out.println(ans);
    }
}
