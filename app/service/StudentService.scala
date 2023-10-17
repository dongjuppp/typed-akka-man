package service


import model.Student
import play.api.Logging

import javax.inject.Singleton

@Singleton
class StudentService extends Logging{

    def getStudentById(id: Long) = {
        logger.info(s"get student by id: ${id}")
        Student(id, "Henry", 1)
    }

}
