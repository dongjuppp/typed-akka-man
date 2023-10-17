package controllers

import play.api.libs.json.Json
import play.api.mvc.{BaseController, ControllerComponents}
import service.StudentService

import javax.inject.{Inject, Singleton}

@Singleton
class StudentController @Inject()(val controllerComponents: ControllerComponents
                                 ,studentService: StudentService) extends BaseController{

    def student(id: Long) = Action {implicit request =>
        Ok(Json.obj("code" -> "0000", "student" -> studentService.getStudentById(id)))
    }

}
