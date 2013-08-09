public class BonusPay implements IPay {


    @Override
    public int GetPayCount(int levelId) {
        return levelId * 2000;
    }
}
