addSbtPlugin("com.dwijnand"      % "sbt-travisci" % "1.1.1")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % "1.1.1")
addSbtPlugin("com.geirsson"      % "sbt-scalafmt" % "1.5.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.0.0")
addSbtPlugin("io.get-coursier"   % "sbt-coursier" % "1.0.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray"  % "0.5.4")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git