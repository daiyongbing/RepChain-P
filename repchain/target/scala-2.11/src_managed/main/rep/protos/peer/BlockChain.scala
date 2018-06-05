// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rep.protos.peer



@SerialVersionUID(0L)
final case class BlockChain(
    block: _root_.scala.collection.Seq[rep.protos.peer.Block] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[BlockChain] with com.trueaccord.lenses.Updatable[BlockChain] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      block.foreach(block => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(block.serializedSize) + block.serializedSize)
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
      block.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): rep.protos.peer.BlockChain = {
      val __block = (_root_.scala.collection.immutable.Vector.newBuilder[rep.protos.peer.Block] ++= this.block)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __block += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, rep.protos.peer.Block.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      rep.protos.peer.BlockChain(
          block = __block.result()
      )
    }
    def clearBlock = copy(block = _root_.scala.collection.Seq.empty)
    def addBlock(__vs: rep.protos.peer.Block*): BlockChain = addAllBlock(__vs)
    def addAllBlock(__vs: TraversableOnce[rep.protos.peer.Block]): BlockChain = copy(block = block ++ __vs)
    def withBlock(__v: _root_.scala.collection.Seq[rep.protos.peer.Block]): BlockChain = copy(block = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => block
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(block.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = rep.protos.peer.BlockChain
}

object BlockChain extends com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.BlockChain] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.BlockChain] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): rep.protos.peer.BlockChain = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    rep.protos.peer.BlockChain(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[rep.protos.peer.Block]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[rep.protos.peer.BlockChain] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      rep.protos.peer.BlockChain(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[rep.protos.peer.Block]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PeerProto.javaDescriptor.getMessageTypes.get(11)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PeerProto.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = rep.protos.peer.Block
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = rep.protos.peer.BlockChain(
  )
  implicit class BlockChainLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.BlockChain]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, rep.protos.peer.BlockChain](_l) {
    def block: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[rep.protos.peer.Block]] = field(_.block)((c_, f_) => c_.copy(block = f_))
  }
  final val BLOCK_FIELD_NUMBER = 1
}
