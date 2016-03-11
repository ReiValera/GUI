package api;
public class TestWeather
{

	public static void main(String[] args)
	{
		WeatherAPI weather = new WeatherAPI("44418"); //44418 is WOEID for london
		System.out.println(weather.theWeatherRSS);
                System.out.println(weather.Location);
                System.out.println(weather.CurrentTemp);
                System.out.println(weather.Condition);
                System.out.println(weather.code);

		for(int i = 0; i < weather.weatherForecastList.size(); i++)
		{
			System.out.println(weather.weatherForecastList.get(i).lowTemp + " " +
			weather.weatherForecastList.get(i).highTemp);
		}
	}
}
