package observer;

public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("호빗의 현재 날씨 : " + currentWeather.getDescription());
    }
}
