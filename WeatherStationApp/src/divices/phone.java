package divices;

import Display.CurrentConditionsDisplay;

public class phone implements CurrentConditionsDisplay {
    @Override
    public void update(double temp, double hum, double press) {
        System.out.println();
    }
}
