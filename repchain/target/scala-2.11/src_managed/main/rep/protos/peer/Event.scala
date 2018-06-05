// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rep.protos.peer



/** Event 用于图形展示的事件
  *
  * @param from
  *  来源addr
  * @param to
  *  发送addr，如果是广播（需要定义一个）
  */
@SerialVersionUID(0L)
final case class Event(
    from: String = "",
    to: String = "",
    action: rep.protos.peer.Event.Action = rep.protos.peer.Event.Action.SUBSCRIBE_TOPIC,
    blk: scala.Option[rep.protos.peer.Block] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Event] with com.trueaccord.lenses.Updatable[Event] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (from != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, from) }
      if (to != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, to) }
      if (action != rep.protos.peer.Event.Action.SUBSCRIBE_TOPIC) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(3, action.value) }
      if (blk.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(blk.get.serializedSize) + blk.get.serializedSize }
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
        val __v = from
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = to
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = action
        if (__v != rep.protos.peer.Event.Action.SUBSCRIBE_TOPIC) {
          _output__.writeEnum(3, __v.value)
        }
      };
      blk.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): rep.protos.peer.Event = {
      var __from = this.from
      var __to = this.to
      var __action = this.action
      var __blk = this.blk
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __from = _input__.readString()
          case 18 =>
            __to = _input__.readString()
          case 24 =>
            __action = rep.protos.peer.Event.Action.fromValue(_input__.readEnum())
          case 34 =>
            __blk = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __blk.getOrElse(rep.protos.peer.Block.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      rep.protos.peer.Event(
          from = __from,
          to = __to,
          action = __action,
          blk = __blk
      )
    }
    def withFrom(__v: String): Event = copy(from = __v)
    def withTo(__v: String): Event = copy(to = __v)
    def withAction(__v: rep.protos.peer.Event.Action): Event = copy(action = __v)
    def getBlk: rep.protos.peer.Block = blk.getOrElse(rep.protos.peer.Block.defaultInstance)
    def clearBlk: Event = copy(blk = None)
    def withBlk(__v: rep.protos.peer.Block): Event = copy(blk = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = from
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = to
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = action.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 4 => blk.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(from)
        case 2 => _root_.scalapb.descriptors.PString(to)
        case 3 => _root_.scalapb.descriptors.PEnum(action.scalaValueDescriptor)
        case 4 => blk.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = rep.protos.peer.Event
}

object Event extends com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.Event] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[rep.protos.peer.Event] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): rep.protos.peer.Event = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    rep.protos.peer.Event(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String],
      rep.protos.peer.Event.Action.fromValue(__fieldsMap.getOrElse(__fields.get(2), rep.protos.peer.Event.Action.SUBSCRIBE_TOPIC.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[rep.protos.peer.Block]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[rep.protos.peer.Event] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      rep.protos.peer.Event(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[String]).getOrElse(""),
        rep.protos.peer.Event.Action.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(rep.protos.peer.Event.Action.SUBSCRIBE_TOPIC.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[rep.protos.peer.Block]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PeerProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PeerProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => __out = rep.protos.peer.Block
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 3 => rep.protos.peer.Event.Action
    }
  }
  lazy val defaultInstance = rep.protos.peer.Event(
  )
  sealed trait Action extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Action
    def isSubscribeTopic: Boolean = false
    def isTransaction: Boolean = false
    def isBlockNew: Boolean = false
    def isBlockEndorsement: Boolean = false
    def isEndorsement: Boolean = false
    def isMemberUp: Boolean = false
    def isMemberDown: Boolean = false
    def isCandidator: Boolean = false
    def isGenesisBlock: Boolean = false
    def isBlockSync: Boolean = false
    def isBlockSyncData: Boolean = false
    def isBlockSyncSuc: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Action] = rep.protos.peer.Event.Action
  }
  
  object Action extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Action] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Action] = this
    @SerialVersionUID(0L)
    case object SUBSCRIBE_TOPIC extends Action {
      val value = 0
      val index = 0
      val name = "SUBSCRIBE_TOPIC"
      override def isSubscribeTopic: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TRANSACTION extends Action {
      val value = 1
      val index = 1
      val name = "TRANSACTION"
      override def isTransaction: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BLOCK_NEW extends Action {
      val value = 2
      val index = 2
      val name = "BLOCK_NEW"
      override def isBlockNew: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BLOCK_ENDORSEMENT extends Action {
      val value = 3
      val index = 3
      val name = "BLOCK_ENDORSEMENT"
      override def isBlockEndorsement: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object ENDORSEMENT extends Action {
      val value = 4
      val index = 4
      val name = "ENDORSEMENT"
      override def isEndorsement: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object MEMBER_UP extends Action {
      val value = 5
      val index = 5
      val name = "MEMBER_UP"
      override def isMemberUp: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object MEMBER_DOWN extends Action {
      val value = 6
      val index = 6
      val name = "MEMBER_DOWN"
      override def isMemberDown: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CANDIDATOR extends Action {
      val value = 7
      val index = 7
      val name = "CANDIDATOR"
      override def isCandidator: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object GENESIS_BLOCK extends Action {
      val value = 8
      val index = 8
      val name = "GENESIS_BLOCK"
      override def isGenesisBlock: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BLOCK_SYNC extends Action {
      val value = 9
      val index = 9
      val name = "BLOCK_SYNC"
      override def isBlockSync: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BLOCK_SYNC_DATA extends Action {
      val value = 10
      val index = 10
      val name = "BLOCK_SYNC_DATA"
      override def isBlockSyncData: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object BLOCK_SYNC_SUC extends Action {
      val value = 11
      val index = 11
      val name = "BLOCK_SYNC_SUC"
      override def isBlockSyncSuc: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Action with _root_.com.trueaccord.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(SUBSCRIBE_TOPIC, TRANSACTION, BLOCK_NEW, BLOCK_ENDORSEMENT, ENDORSEMENT, MEMBER_UP, MEMBER_DOWN, CANDIDATOR, GENESIS_BLOCK, BLOCK_SYNC, BLOCK_SYNC_DATA, BLOCK_SYNC_SUC)
    def fromValue(value: Int): Action = value match {
      case 0 => SUBSCRIBE_TOPIC
      case 1 => TRANSACTION
      case 2 => BLOCK_NEW
      case 3 => BLOCK_ENDORSEMENT
      case 4 => ENDORSEMENT
      case 5 => MEMBER_UP
      case 6 => MEMBER_DOWN
      case 7 => CANDIDATOR
      case 8 => GENESIS_BLOCK
      case 9 => BLOCK_SYNC
      case 10 => BLOCK_SYNC_DATA
      case 11 => BLOCK_SYNC_SUC
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = rep.protos.peer.Event.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = rep.protos.peer.Event.scalaDescriptor.enums(0)
  }
  implicit class EventLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.Event]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, rep.protos.peer.Event](_l) {
    def from: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.from)((c_, f_) => c_.copy(from = f_))
    def to: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.to)((c_, f_) => c_.copy(to = f_))
    def action: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.Event.Action] = field(_.action)((c_, f_) => c_.copy(action = f_))
    def blk: _root_.com.trueaccord.lenses.Lens[UpperPB, rep.protos.peer.Block] = field(_.getBlk)((c_, f_) => c_.copy(blk = Some(f_)))
    def optionalBlk: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[rep.protos.peer.Block]] = field(_.blk)((c_, f_) => c_.copy(blk = f_))
  }
  final val FROM_FIELD_NUMBER = 1
  final val TO_FIELD_NUMBER = 2
  final val ACTION_FIELD_NUMBER = 3
  final val BLK_FIELD_NUMBER = 4
}