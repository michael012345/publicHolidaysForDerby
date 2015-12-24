package enums

object TimeZoneId extends Enumeration {

  val LOCAL = Value("LOCAL")
  val `GMT+10:00` = Value("+10")
  val `GMT-10:00` = Value("-10")
  val `GMT+08:00` = Value("+08")
  val GMT = Value("GMT")
  val `Australia/Perth` = Value("Australia/Perth")
  val `Australia/Sydney` = Value("Australia/Sydney")
}
