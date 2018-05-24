package Trait
import java.time.LocalDate

class WeatherForecasting extends IWeatherForecasting {
  override def getWeatherForecasting(date: LocalDate): Weather = {
    println("Getting weather ...")
    Weather(date.toString,"23")
  }
}
