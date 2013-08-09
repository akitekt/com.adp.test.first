

public class NormalPay implements IPay {


    public NormalPay() {

    }

    @Override
    public int GetPayCount(int levelId) {
        if (levelId == 0) {
            return 0;
        } else if (levelId < 0) {
            throw new IllegalArgumentException("value must be > 0");
        }
        return 1000 * levelId;
    }
}
