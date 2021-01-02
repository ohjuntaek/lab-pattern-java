package observer;

public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println(("오크의 현재 날씨 " + currentWeather.getDescription()));
    }
}
