package utils

import constants.DateAndTime
import enums.{TimeZoneId, DateFormat}
import org.joda.time.format.DateTimeFormat
import org.joda.time.{DateTime, DateTimeZone}

object DateUtils {

  def getDateTime(date: String)(pattern: DateFormat.Value): DateTime = {
    val formatter = DateTimeFormat.forPattern(pattern.toString)
    formatter.parseDateTime(date)
  }

  def isValidTimeZone(timeZoneId: TimeZoneId.Value) = {
    timeZoneId != TimeZoneId.LOCAL
  }

  def getZone(timeZoneId: String) = {
    DateTimeZone.forID(timeZoneId)
  }

  def getDateTimeWithZone(date: String)(pattern: DateFormat.Value)(timeZone: DateTimeZone): DateTime = {
    val formatter = DateTimeFormat.forPattern(pattern.toString)
    formatter.withZone(timeZone).parseDateTime(date)
  }

  def isTimeChangeHappened(day: DateTime, dateTimeZone: DateTimeZone) = {
    val nextDay = day.plusDays(1)
    nextDay.getMillis - day.getMillis != DateAndTime.ADay
  }

  def getDateTimeString(dateTime: DateTime)(dateFormat: DateFormat.Value)(timeZone: DateTimeZone) = {
    val out = DateTimeFormat.forPattern(dateFormat.toString)
    out.withZone(timeZone).print(dateTime)
  }

}