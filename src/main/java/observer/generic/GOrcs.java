package observer.generic;

import observer.WeatherType;

public class GOrcs implements Race {

  @Override
  public void update(GWeather weather, WeatherType weatherType) {
    System.out.println("The orcs are facing " + weatherType.getDescription());
  }
}