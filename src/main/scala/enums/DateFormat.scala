package enums

object DateFormat extends Enumeration {
  type DateFormat = Value
  val `dd-MM-yyyy HH:mm:ss` = Value("dd-MM-yyyy HH:mm:ss")
  val yyyyMMdd = Value("yyyyMMdd")
  val yyyyMMddHHmmss = Value("yyyyMMddHHmmss")
  val yyyyMMddHHmm = Value("yyyyMMddHHmm")
  val `dd/MM/yyyy HH:mm` = Value("dd/MM/yyyy HH:mm")
  val `dd/MM/yyyy` = Value("dd/MM/yyyy")
}
