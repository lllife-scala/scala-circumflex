package controllers

import play.api._
import play.api.mvc._
import models.ReferenceInfo
import models.UserInfo
import models.Test
import java.util.Calendar

object Application extends Controller {

  def index = Action {

    user

    Ok("<h1>Hello</h1>")
  }

  def user = {
    val user = new UserInfo()
    user.password := "admin"
    user.userName := "admin"
    user.createDate := Calendar.getInstance().getTime()
    user.firstName := "admin"
    user.lastName := "admin"
    user.position := "admin"
    user.isDelete := false
    val rs = user.save_!()

    //test

    Ok("200" + rs.toString)
  }

  def test = {

    var now = Calendar.getInstance().getTime()
    val ref = new ReferenceInfo()
    ref.reference := "xxx"
    ref.page := 0
    ref.customerName := ""
    ref.customerSurname := ""
    ref.status := ""
    ref.createDate := now

    // Register
    ref.registerDate := now
    ref.registerUser := ""

    // Scan
    ref.scanDate := now
    ref.scanUser := ""

    // Index
    ref.indexDate := now
    ref.indexUser := ""

    // Admin
    ref.adminDate := now
    ref.adminUser := ""


    ref.applicationType := ""
    ref.fullShort := ""

    ref.cleanUnClean := ""
    ref.idCardNumber := ""
    ref.passportNumber := ""
    ref.packNumber := ""
    ref.productPlan := ""
    ref.bupaCaseOwner := ""
    ref.bupaCaseOwnerName := ""
    ref.hospital := ""
    ref.recordStart := now
    ref.recordEnd := now
    ref.receipt := ""
    ref.cancelDate := now
    ref.cancelUser := ""
    ref.batchNumber := "x"
    ref.packNumber := "x"
    ref.voucherNumber := ""
    ref.isGenerate := true
    ref.isDelete := true


    ref.INSERT()


    Ok(views.html.index("Hi"))
  }

}