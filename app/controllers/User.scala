package controllers

import play.api._
import play.api.mvc._
import models.ReferenceInfo
import circumflex.orm.TextField

object User extends Controller {
  def delete(id: Int) = Action {

    var ref = new ReferenceInfo
    ref.reference := "xxx"

    ref.INSERT()

//    val result = ref.save()


    Ok("{}")

  }
}