// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rep.protos.peer



/** 背书，可用于Transaction和Block
  *
  * @param endorser
  *   Identity of the endorser (e.g. its certificate)
  *  目前将其改为cert对应公钥的短地址，为了减少数据大小
  * @param signature
  *   Signature of the payload included in ProposalResponse concatenated with
  *   the endorser's certificate; ie, sign(ProposalResponse.payload + endorser)
  */
@SerialVersionUID(0L)
final case class Endorsement(
    endorser: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    signature: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Endorsement] with com.trueaccord.lenses.Updatable[Endorsement] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (endorser != _root_.com.google.protobuf.ByteString.EMPTY) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, endorser) }
      if (signature != _root_.com.google.protobuf.ByteString.EMPTY) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, signature) }
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
        val __v = endorser
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(1, __v)
        }
      };
      {
        val __v = signature
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): rep.protos.peer.Endorsement = {
      var __endorser = this.endorser
      var __signature = this.signature
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __endorser = _input__.readBytes()
          case 18 =>
            __signature = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      rep.protos.peer.Endorsement(
          endorser = __endorser,
          signature = __signature
      )
    }
    def withEndorser(__v: _root_.com.google.protobuf.ByteString): Endorsement = copy(endorser = __v)
    def withSignature(__v: _root_.com.google.protobuf.ByteString): Endorsement = copy(signature = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = endorser
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 2 => {
          val __t = signature
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PByteString(endorser)
        case 2 => _root_.scalapb.descriptors.PByteString(signature)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = rep.protos.peer.Endorsement
}

object Endorsement extends com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.Endorsement] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.Endorsement] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): rep.protos.peer.Endorsement = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    rep.protos.peer.Endorsement(
      __fieldsMap.getOrElse(__fields.get(0), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
      __fieldsMap.getOrElse(__fields.get(1), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[rep.protos.peer.Endorsement] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      rep.protos.peer.Endorsement(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PeerProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PeerProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = rep.protos.peer.Endorsement(
  )
  implicit class EndorsementLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.Endorsement]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, rep.protos.peer.Endorsement](_l) {
    def endorser: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.endorser)((c_, f_) => c_.copy(endorser = f_))
    def signature: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.signature)((c_, f_) => c_.copy(signature = f_))
  }
  final val ENDORSER_FIELD_NUMBER = 1
  final val SIGNATURE_FIELD_NUMBER = 2
}
