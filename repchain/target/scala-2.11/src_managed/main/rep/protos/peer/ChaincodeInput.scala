// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rep.protos.peer



/** Carries the chaincode function and its arguments.
  */
@SerialVersionUID(0L)
final case class ChaincodeInput(
    function: String = "",
    args: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ChaincodeInput] with com.trueaccord.lenses.Updatable[ChaincodeInput] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (function != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, function) }
      args.foreach(args => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, args))
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = function
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      args.foreach { __v =>
        _output__.writeString(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): rep.protos.peer.ChaincodeInput = {
      var __function = this.function
      val __args = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.args)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __function = _input__.readString()
          case 18 =>
            __args += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      rep.protos.peer.ChaincodeInput(
          function = __function,
          args = __args.result()
      )
    }
    def withFunction(__v: String): ChaincodeInput = copy(function = __v)
    def clearArgs = copy(args = _root_.scala.collection.Seq.empty)
    def addArgs(__vs: String*): ChaincodeInput = addAllArgs(__vs)
    def addAllArgs(__vs: TraversableOnce[String]): ChaincodeInput = copy(args = args ++ __vs)
    def withArgs(__v: _root_.scala.collection.Seq[String]): ChaincodeInput = copy(args = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = function
          if (__t != "") __t else null
        }
        case 2 => args
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(function)
        case 2 => _root_.scalapb.descriptors.PRepeated(args.map(_root_.scalapb.descriptors.PString(_))(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = rep.protos.peer.ChaincodeInput
}

object ChaincodeInput extends com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.ChaincodeInput] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.ChaincodeInput] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): rep.protos.peer.ChaincodeInput = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    rep.protos.peer.ChaincodeInput(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[rep.protos.peer.ChaincodeInput] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      rep.protos.peer.ChaincodeInput(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PeerProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PeerProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = rep.protos.peer.ChaincodeInput(
  )
  implicit class ChaincodeInputLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.ChaincodeInput]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, rep.protos.peer.ChaincodeInput](_l) {
    def function: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.function)((c_, f_) => c_.copy(function = f_))
    def args: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.args)((c_, f_) => c_.copy(args = f_))
  }
  final val FUNCTION_FIELD_NUMBER = 1
  final val ARGS_FIELD_NUMBER = 2
}
