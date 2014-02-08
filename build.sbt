name := "HelloPlay"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

// mysql connector
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"

// circumflex.ru
// libraryDependencies += "ru.circumflex" % "circumflex-orm" % "2.5" % "compile->default"


libraryDependencies += "pro.savant.circumflex" % "circumflex-orm" % "3.1-SNAPSHOT"
//
//
//
//val main = play.Project(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
//  resolvers += "Local Maven Repository" at "file:"+Path.userHome.absolutePath+"/.m2/repository"
//)