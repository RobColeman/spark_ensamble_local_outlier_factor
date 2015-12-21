name := "spark_ensamble_local_outlier_factor"

version := "1.0"

scalaVersion := "2.10.4"

val scalaTestVersion = "2.2.4"
val breezeVersion = "0.11.2"
val sparkVersion = "1.6.1"

resolvers ++= Seq(
  "Typesafe repository snapshots"    at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository releases"     at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype repo"                    at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype releases"                at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots"               at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype staging"                 at "http://oss.sonatype.org/content/repositories/staging",
  "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
  "websudos"                         at "http://dl.bintray.com/websudos/oss-releases",
  "Typesafe Repo"                    at "http://repo.typesafe.com/typesafe/releases/",
  "Job Server Bintray"               at "https://dl.bintray.com/spark-jobserver/maven"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"          % scalaTestVersion  % "test",
  "org.scalanlp"  %% "breeze"             % breezeVersion,
  "org.scalanlp"  %% "breeze-natives"     % breezeVersion,
  "org.apache.commons" % "commons-math3"  % "3.3",
  "org.apache.spark" %% "spark-core"                      % sparkVersion,
  "org.apache.spark" %% "spark-streaming"                 % sparkVersion,
  "org.apache.spark" %% "spark-sql"                       % sparkVersion,
  "org.apache.spark" %% "spark-mllib"                     % sparkVersion,
  "org.apache.spark" % "spark-streaming_2.10"             % sparkVersion,
  "org.apache.spark" % "spark-streaming-kinesis-asl_2.10" % sparkVersion
)