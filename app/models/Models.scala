package models

//import ru.circumflex.orm.{Relation, ValueHolder, Record, Table}
import circumflex.orm._

class ReferenceInfo extends Record[String, ReferenceInfo] {

  def PRIMARY_KEY: ValueHolder[String, ReferenceInfo] = reference
  def relation = ReferenceInfo

  // Primary
  val reference = "Reference".VARCHAR(45)
  val page = "Page".INTEGER
  val customerName = "CustomerName".VARCHAR(45)
  val customerSurname = "CustomerSurname".VARCHAR(45)
  val status = "Status".VARCHAR(45)
  val createDate = "CreateDate".DATE

  // Register
  val registerDate = "RegisterDate".DATE
  val registerUser = "RegisterUser".VARCHAR(45)

  // Scan
  val scanDate = "ScanDate".DATE
  val scanUser = "ScanUser".VARCHAR(45)

  // Index
  val indexDate = "IndexDate".DATE
  val indexUser = "IndexUser".VARCHAR(45)

  // Admin
  val adminDate = "AdminDate".DATE
  val adminUser = "AdminUser".VARCHAR(45)

  // Extend
  val applicationType = "ApplicationType".VARCHAR(45)
  val fullShort = "FullShort".VARCHAR(45)
  val cleanUnClean = "CleanUnClean".VARCHAR(45)
  val idCardNumber = "IDCardNumber".VARCHAR(45)
  val passportNumber = "PassportNumber".VARCHAR(45)
  val productPlan = "ProductPlan".VARCHAR(45)
  val bupaCaseOwner = "BupaCaseOwner".VARCHAR(45)
  val bupaCaseOwnerName = "BupaCaseOwnerName".VARCHAR(45)
  val hospital = "Hospital".VARCHAR(45)

  // Date
  val recordStart = "RecordStart".DATE
  val recordEnd = "RecordEnd".DATE
  val receipt = "Receipt".VARCHAR(45)
  val cancelDate = "CancelDate".DATE
  val cancelUser = "CancelUser".VARCHAR(45)
  val batchNumber = "BatchNumber".VARCHAR(45)
  val packNumber = "PackNumber".VARCHAR(45)
  val voucherNumber = "VoucherNumber".VARCHAR(45)
  val isGenerate = "IsGenerate".BOOLEAN
  val isDelete = "IsDelete".BOOLEAN

}

object ReferenceInfo extends ReferenceInfo with Table[String, ReferenceInfo] {
  override def relationName = "breferenceinfo"
}

class UserInfo extends Record[Int, UserInfo] with IdentityGenerator[Int, UserInfo] {

  def PRIMARY_KEY: ValueHolder[Int, UserInfo] = id
  def relation: Relation[Int, UserInfo] = UserInfo

  val id = "ID".INTEGER.AUTO_INCREMENT
  val userName = "Username".VARCHAR(45)
  val password = "Password".VARCHAR(45)
  val firstName = "Firstname".VARCHAR(45)
  val lastName = "Lastname".VARCHAR(45)
  val position = "Position".VARCHAR(45)
  val isDelete = "IsDelete".BOOLEAN
  val createDate = "CreateDate".DATE
}

object UserInfo extends UserInfo with Table[Int, UserInfo] {
  override  def relationName = "buserinfo"
}

class Test extends Record[Int, Test] with IdentityGenerator[Int, Test] {
  def PRIMARY_KEY = id

  def relation = Test

  val id = "id".INTEGER.AUTO_INCREMENT
  val name = "name".VARCHAR(45)
}

object Test extends Test with Table[Int, Test] {
  override def relationName = "test"
}
