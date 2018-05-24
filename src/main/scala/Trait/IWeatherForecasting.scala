package Trait

import java.time.LocalDate

trait IWeatherForecasting {

  def getWeatherForecasting(date:LocalDate) : Weather

}
