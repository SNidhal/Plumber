package services.tracer

case class trace(
                  fileName : String ,
                  sourceDirectory : String ,
                  destinationDirectory : String ,
                  State: String ,
                  Cheksum: String,
                  Message: String,
                  Size : String,
                  LastModifiedDate : String)
