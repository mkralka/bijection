resolvers ++= Seq(
  "jgit-repo" at "http://download.eclipse.org/jgit/maven"
)

addSbtPlugin("com.github.gseitz" % "sbt-release"     % "1.0.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"         % "1.0.0")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.1.8")
addSbtPlugin("com.typesafe.sbt"  % "sbt-ghpages"     % "0.5.2")
addSbtPlugin("com.typesafe.sbt"  % "sbt-osgi"        % "0.7.0")
addSbtPlugin("com.typesafe.sbt"  % "sbt-scalariform" % "1.3.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"    % "1.0")
