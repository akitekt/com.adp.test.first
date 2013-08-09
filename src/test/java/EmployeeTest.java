import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;



public class EmployeeTest {

    Injector injector;
    IPay paymethod;

    @Before
    public void initialize() {
        injector = Guice.createInjector(new PayModule());
        paymethod = injector.getInstance(IPay.class);

    }

    @Test
    public void should_get_injected() {

        assertEquals(paymethod.getClass(),NormalPay.class);
    }

    @Test
    public void should_get_paid_normally() {
        int levelId = 10;
        Employee sut = new Employee(levelId,paymethod);
        assertEquals(sut.getPay(),1000 * levelId);
//        assertThat(sut.getPay()).isEqualTo(1000 * levelId);
//        assertThat(levelId).isEqualTo(10);

    }
}
