// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rep.protos.peer



sealed trait ConfidentialityLevel extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ConfidentialityLevel
  def isLevelUndefined: Boolean = false
  def isPublic: Boolean = false
  def isConfidential: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ConfidentialityLevel] = rep.protos.peer.ConfidentialityLevel
}

object ConfidentialityLevel extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ConfidentialityLevel] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ConfidentialityLevel] = this
  @SerialVersionUID(0L)
  case object LEVEL_UNDEFINED extends ConfidentialityLevel {
    val value = 0
    val index = 0
    val name = "LEVEL_UNDEFINED"
    override def isLevelUndefined: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PUBLIC extends ConfidentialityLevel {
    val value = 1
    val index = 1
    val name = "PUBLIC"
    override def isPublic: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CONFIDENTIAL extends ConfidentialityLevel {
    val value = 2
    val index = 2
    val name = "CONFIDENTIAL"
    override def isConfidential: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ConfidentialityLevel with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(LEVEL_UNDEFINED, PUBLIC, CONFIDENTIAL)
  def fromValue(value: Int): ConfidentialityLevel = value match {
    case 0 => LEVEL_UNDEFINED
    case 1 => PUBLIC
    case 2 => CONFIDENTIAL
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = PeerProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = PeerProto.scalaDescriptor.enums(0)
}