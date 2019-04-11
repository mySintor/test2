import org.junit.Test;

/**
 * @author Sin
 * @date 2019/4/9/19:43
 */
public class AdapterTest {
    @Test
    public void test() {
        IIntelligentControl intelligentControl = new IntelligentControl();
        intelligentControl.controlTV();
        intelligentControl.controlAirCondition();
    }

}

class TVControl{
    public void controlTV(){
        System.out.println("controlTV");
    }
}

interface IIntelligentControl{
    void controlTV();
    void controlAirCondition();
}

class IntelligentControl extends TVControl implements IIntelligentControl{
    @Override
    public void controlAirCondition() {
        System.out.println("controlAirCondition");
    }
}

/*
class IntelligentControl implements IIntelligentControl{
    TVControl tvControl;
    public IntelligentControl(TVControl tvControl) {
        this.tvControl = tvControl;
    }

    @Override
    public void controlTV() {
        tvControl.controlTV();
    }

    @Override
    public void controlAirCondition() {
        System.out.println("controlAirCondition");
    }
}*/
