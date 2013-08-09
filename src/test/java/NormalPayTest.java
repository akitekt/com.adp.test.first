import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NormalPayTest {

    @Test(expected = Exception.class)
    public void should_throw() {
        NormalPay sut = new NormalPay();
        sut.GetPayCount(-1);
        assertEquals(1, 1);
    }


    @Test
    public void should_return_value() {
        NormalPay sut = new NormalPay();
        assertEquals(5000, sut.GetPayCount(5));

    }


    @Test
    public void should_validate_input() {
        NormalPay sut = new NormalPay();
        assertEquals(0, sut.GetPayCount(0));

    }


    @Test
    public void should_mock_it() {
        NormalPay sut = mock(NormalPay.class);
        when(sut.GetPayCount(0)).thenReturn(1000);
        assertEquals(1000, sut.GetPayCount(0));


    }
}
