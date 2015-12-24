package constants

/**
 * Created by rchen on 12/11/15.
 */
object DateAndTime {

  val MinutesInADay = 24 * 60;
  val AMinute = 60 * 1000; // milli-seconds
  val ADay: Long = MinutesInADay * AMinute; // milli-seconds

}
