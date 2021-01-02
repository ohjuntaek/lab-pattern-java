package observer.generic;

import observer.WeatherType;

public class GHobbits implements Race {
    @Override
    public void update(GWeather weather, WeatherType currentWeather) {
        System.out.println("호빗의 현재 날씨 : " + currentWeather.getDescription());
    }
}
