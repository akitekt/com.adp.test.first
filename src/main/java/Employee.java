import com.google.inject.Inject;


public class Employee {


    private final int payLevelId;

    private final IPay paymethod;

    @Inject
    public Employee(int levelId, IPay paymethod) {
        this.payLevelId = levelId;
        this.paymethod = paymethod;
    }

    public int getPay() {
        return paymethod.GetPayCount(payLevelId);
    }
}
