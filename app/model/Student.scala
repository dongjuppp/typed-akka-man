package model

import play.api.libs.json.{Json, OFormat}

case class Student(id: Long,
                   name: String,
                   grade: Int)

object Student {
    implicit val format: OFormat[Student] = Json.format[Student]
}
