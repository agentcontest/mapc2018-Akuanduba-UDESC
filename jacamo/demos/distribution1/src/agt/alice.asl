{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

+hello(X)[source(A)] <- .println("I received a hello ",X," from ",A).
