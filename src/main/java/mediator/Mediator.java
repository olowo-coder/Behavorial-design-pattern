package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private final List<Light> lights = new ArrayList<Light>();

    public void registerLight(Light light){
        lights.add(light);
    }

    public void turnOnAllLights(){
        lights.stream().filter(light -> !light.isOn()).forEach(Light::toggle);
    }

    public void turnOffAllLights(){
        lights.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}
