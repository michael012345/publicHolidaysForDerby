package utils

import java.io
import java.io.File

import com.typesafe.scalalogging.LazyLogging

object FileUtils extends LazyLogging {

  def deleteFile(fullFileName: String): Boolean = {
    logger.info("Deleting file:" + fullFileName)
    val theFile = new io.File(fullFileName)
    if (theFile.exists) {
      val deleted = theFile.delete
      logger.info(s"File ${fullFileName} deleted = $deleted")
      return deleted
    }
    logger.info("File:" + fullFileName + " does not exists.")
    false
  }

  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }
}
