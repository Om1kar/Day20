public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {}
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (this.message.contains("sad")) {
            return "SAD";
        }else
            return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser("i am sad");
        System.out.println(mood.analyseMood());
        MoodAnalyser mood2 = new MoodAnalyser("i am happy");
        System.out.println(mood2.analyseMood());
    }
}
