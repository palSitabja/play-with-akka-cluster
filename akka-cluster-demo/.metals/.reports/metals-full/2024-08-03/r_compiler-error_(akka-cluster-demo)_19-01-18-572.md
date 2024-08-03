file:///C:/Users/sitab/IdeaProjects/play-with-akka-cluster/akka-cluster-demo/src/main/scala/ClusterApp.scala
### scala.reflect.internal.FatalError: 
  bad constant pool index: 0 at pos: 48445
     while compiling: <no file>
        during phase: globalPhase=<no phase>, enteringPhase=<some phase>
     library version: version 2.13.9
    compiler version: version 2.13.9
  reconstructed args: -classpath <WORKSPACE>\src\main\resources;<WORKSPACE>\target\bloop-bsp-clients-classes\classes-Metals-QdeEdkNyTfaV0MTSoLAFVA==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\target\classes;<HOME>\.m2\repository\com\typesafe\akka\akka-actor-typed_2.13\2.6.19\akka-actor-typed_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-actor_2.13\2.6.19\akka-actor_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\config\1.4.2\config-1.4.2.jar;<HOME>\.m2\repository\org\scala-lang\modules\scala-java8-compat_2.13\1.0.0\scala-java8-compat_2.13-1.0.0.jar;<HOME>\.m2\repository\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-cluster_2.13\2.6.19\akka-cluster_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-remote_2.13\2.6.19\akka-remote_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-stream_2.13\2.6.19\akka-stream_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-protobuf-v3_2.13\2.6.19\akka-protobuf-v3_2.13-2.6.19.jar;<HOME>\.m2\repository\org\reactivestreams\reactive-streams\1.0.3\reactive-streams-1.0.3.jar;<HOME>\.m2\repository\com\typesafe\ssl-config-core_2.13\0.4.3\ssl-config-core_2.13-0.4.3.jar;<HOME>\.m2\repository\org\scala-lang\modules\scala-parser-combinators_2.13\1.1.2\scala-parser-combinators_2.13-1.1.2.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-pki_2.13\2.6.19\akka-pki_2.13-2.6.19.jar;<HOME>\.m2\repository\com\hierynomus\asn-one\0.5.0\asn-one-0.5.0.jar;<HOME>\.m2\repository\org\agrona\agrona\1.14.0\agrona-1.14.0.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-coordination_2.13\2.6.19\akka-coordination_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-slf4j_2.13\2.6.19\akka-slf4j_2.13-2.6.19.jar;<HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar;<HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: EmptyTree
       tree position: <unknown>
            tree tpe: <notype>
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==



occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.9
Classpath:
<WORKSPACE>\src\main\resources [exists ], <WORKSPACE>\target\bloop-bsp-clients-classes\classes-Metals-QdeEdkNyTfaV0MTSoLAFVA== [missing ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.10.0\semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>\target\classes [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-actor-typed_2.13\2.6.19\akka-actor-typed_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-actor_2.13\2.6.19\akka-actor_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\config\1.4.2\config-1.4.2.jar [exists ], <HOME>\.m2\repository\org\scala-lang\modules\scala-java8-compat_2.13\1.0.0\scala-java8-compat_2.13-1.0.0.jar [exists ], <HOME>\.m2\repository\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-cluster_2.13\2.6.19\akka-cluster_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-remote_2.13\2.6.19\akka-remote_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-stream_2.13\2.6.19\akka-stream_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-protobuf-v3_2.13\2.6.19\akka-protobuf-v3_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\org\reactivestreams\reactive-streams\1.0.3\reactive-streams-1.0.3.jar [exists ], <HOME>\.m2\repository\com\typesafe\ssl-config-core_2.13\0.4.3\ssl-config-core_2.13-0.4.3.jar [exists ], <HOME>\.m2\repository\org\scala-lang\modules\scala-parser-combinators_2.13\1.1.2\scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-pki_2.13\2.6.19\akka-pki_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\hierynomus\asn-one\0.5.0\asn-one-0.5.0.jar [exists ], <HOME>\.m2\repository\org\agrona\agrona\1.14.0\agrona-1.14.0.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-coordination_2.13\2.6.19\akka-coordination_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\com\typesafe\akka\akka-slf4j_2.13\2.6.19\akka-slf4j_2.13-2.6.19.jar [exists ], <HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar [exists ], <HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar [exists ]
Options:
-release 21 -Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 478
uri: file:///C:/Users/sitab/IdeaProjects/play-with-akka-cluster/akka-cluster-demo/src/main/scala/ClusterApp.scala
text:
```scala
import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object ClusterApp {

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      startup(Seq("2551", "2552", "2553"))
    } else {
      startup(args)
    }
  }

  def startup(ports: Seq[String]): Unit = {
    ports.foreach { port =>
      // Override the configuration of the port
      val config = ConfigFactory.parseString(s"akka.remote.artery.canonical.port=$port"@@)
        .withFallback(ConfigFactory.load())

      // Create an Akka system
      val system = ActorSystem("ClusterSystem", config)

      // Create the actors
      system.actorOf(Props[ServiceA], "serviceA")
      system.actorOf(Props[ServiceB], "serviceB")

      system.log.info(s"Node started at port $port")
    }
  }
}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.tools.nsc.symtab.classfile.ClassfileParser$ConstantPool.errorBadIndex(ClassfileParser.scala:408)
	scala.tools.nsc.symtab.classfile.ClassfileParser$ConstantPool.getExternalName(ClassfileParser.scala:263)
	scala.tools.nsc.symtab.classfile.ClassfileParser.readParamNames$1(ClassfileParser.scala:842)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseAttribute$1(ClassfileParser.scala:848)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parseAttributes$6(ClassfileParser.scala:925)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseAttributes(ClassfileParser.scala:1497)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseMethod(ClassfileParser.scala:625)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseClass(ClassfileParser.scala:548)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parse$2(ClassfileParser.scala:175)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parse$1(ClassfileParser.scala:160)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parse(ClassfileParser.scala:143)
	scala.tools.nsc.symtab.SymbolLoaders$ClassfileLoader.doComplete(SymbolLoaders.scala:342)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.$anonfun$complete$2(SymbolLoaders.scala:249)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.complete(SymbolLoaders.scala:247)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1563)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1535)
	scala.reflect.internal.Definitions.scala$reflect$internal$Definitions$$enterNewMethod(Definitions.scala:48)
	scala.reflect.internal.Definitions$DefinitionsClass.String_$plus$lzycompute(Definitions.scala:1261)
	scala.reflect.internal.Definitions$DefinitionsClass.String_$plus(Definitions.scala:1261)
	scala.reflect.internal.Definitions$DefinitionsClass.syntheticCoreMethods$lzycompute(Definitions.scala:1583)
	scala.reflect.internal.Definitions$DefinitionsClass.syntheticCoreMethods(Definitions.scala:1565)
	scala.reflect.internal.Definitions$DefinitionsClass.symbolsNotPresentInBytecode$lzycompute(Definitions.scala:1596)
	scala.reflect.internal.Definitions$DefinitionsClass.symbolsNotPresentInBytecode(Definitions.scala:1596)
	scala.reflect.internal.Definitions$DefinitionsClass.init(Definitions.scala:1652)
	scala.tools.nsc.Global$Run.<init>(Global.scala:1236)
	scala.tools.nsc.interactive.Global$TyperRun.<init>(Global.scala:1351)
	scala.tools.nsc.interactive.Global.newTyperRun(Global.scala:1374)
	scala.tools.nsc.interactive.Global.<init>(Global.scala:294)
	scala.meta.internal.pc.MetalsGlobal.<init>(MetalsGlobal.scala:44)
	scala.meta.internal.pc.ScalaPresentationCompiler.newCompiler(ScalaPresentationCompiler.scala:522)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  bad constant pool index: 0 at pos: 48445
     while compiling: <no file>
        during phase: globalPhase=<no phase>, enteringPhase=<some phase>
     library version: version 2.13.9
    compiler version: version 2.13.9
  reconstructed args: -classpath <WORKSPACE>\src\main\resources;<WORKSPACE>\target\bloop-bsp-clients-classes\classes-Metals-QdeEdkNyTfaV0MTSoLAFVA==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\target\classes;<HOME>\.m2\repository\com\typesafe\akka\akka-actor-typed_2.13\2.6.19\akka-actor-typed_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-actor_2.13\2.6.19\akka-actor_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\config\1.4.2\config-1.4.2.jar;<HOME>\.m2\repository\org\scala-lang\modules\scala-java8-compat_2.13\1.0.0\scala-java8-compat_2.13-1.0.0.jar;<HOME>\.m2\repository\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-cluster_2.13\2.6.19\akka-cluster_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-remote_2.13\2.6.19\akka-remote_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-stream_2.13\2.6.19\akka-stream_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-protobuf-v3_2.13\2.6.19\akka-protobuf-v3_2.13-2.6.19.jar;<HOME>\.m2\repository\org\reactivestreams\reactive-streams\1.0.3\reactive-streams-1.0.3.jar;<HOME>\.m2\repository\com\typesafe\ssl-config-core_2.13\0.4.3\ssl-config-core_2.13-0.4.3.jar;<HOME>\.m2\repository\org\scala-lang\modules\scala-parser-combinators_2.13\1.1.2\scala-parser-combinators_2.13-1.1.2.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-pki_2.13\2.6.19\akka-pki_2.13-2.6.19.jar;<HOME>\.m2\repository\com\hierynomus\asn-one\0.5.0\asn-one-0.5.0.jar;<HOME>\.m2\repository\org\agrona\agrona\1.14.0\agrona-1.14.0.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-coordination_2.13\2.6.19\akka-coordination_2.13-2.6.19.jar;<HOME>\.m2\repository\com\typesafe\akka\akka-slf4j_2.13\2.6.19\akka-slf4j_2.13-2.6.19.jar;<HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar;<HOME>\.m2\repository\org\scala-lang\scala-library\2.13.9\scala-library-2.13.9.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: EmptyTree
       tree position: <unknown>
            tree tpe: <notype>
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

