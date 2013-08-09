import com.google.inject.AbstractModule;

public class PayModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IPay.class).to(NormalPay.class);
    }
}
