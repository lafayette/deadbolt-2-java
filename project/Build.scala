import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "deadbolt-java"
  val appVersion      = "2.1-RC2"

  val appDependencies = Seq(
    javaCore,
    cache,
    
    "be.objectify" %% "deadbolt-core" % "2.1-RC2"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    organization := "be.objectify",
    resolvers += Resolver.url("Objectify Play Repository", url("http://repo.laf.su/releases/"))(Resolver.ivyStylePatterns),
    resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://repo.laf.su/snapshots/"))(Resolver.ivyStylePatterns)
  )
}
