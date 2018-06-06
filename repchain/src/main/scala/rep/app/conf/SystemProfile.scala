/*
 * Copyright  2018 Blockchain Technology and Application Joint Lab, Fintech Research Center of ISCAS.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BA SIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rep.app.conf

import com.typesafe.config.Config


/**
  * 系统配置信息缓存对象
  * @author shidianyue
  * @version	0.7
  * @update 2018-05 jiangbuyun
  * */
object SystemProfile {

  /**
    * 交易创建类型
    */
  case object Trans_Create_Type_Enum {
    val MANUAL = 0 //API创建
    val AUTO = 1 //自动创建
  }

  private[this] var _LIMIT_BLOCK_TRANS_NUM: Int = 0//块内最多交易数
  private[this] var _MIN_BLOCK_TRANS_NUM: Int = 0//块内最少交易数
  private[this] var _VOTE_NOTE_MIN: Int = 0//投票最少参与人数
  private[this] var _TRAN_CREATE_DUR: Int = 0//交易创建时间间隔-针对自动创建
  private[this] var _TRANS_CREATE_TYPE: Int = 0//交易创建类型
  private[this] var _RETRY_TIME: Int = 0//投票重试次数限制
  private[this] var _MAX_CATCH_TRANS_NUM: Int = 0//交易最多缓存数量
  private[this] var _DISKSPACE_ALARM_NUM:Long=0//磁盘剩余空间预警 单位=M
  private[this] var _SERVERPORT:Int=8081//http服务的端口，默认为8081

  private[this] var _HTTP_SERVER_DOCKER_URLPARAMS:String = "" //docker封装后的路径配置参数
  private[this] var _HTTP_SERVER_DOCKER_DOCKERNAME:String = "" //映射的docker

  private def SERVERPORT :Int = _SERVERPORT
  private def DISKSPACE_ALARM_NUM :Long = _DISKSPACE_ALARM_NUM

  private def HTTP_SERVER_DOCKER_URLPARAMS:String = _HTTP_SERVER_DOCKER_URLPARAMS
  private def HTTP_SERVER_DOCKER_DOCKERNAME:String = _HTTP_SERVER_DOCKER_DOCKERNAME

  private def SERVERPORT_=(value: Int): Unit = {
    _SERVERPORT = value
  }

  private def HTTP_SERVER_DOCKER_URLPARAMS_=(value: String): Unit = {
    _HTTP_SERVER_DOCKER_URLPARAMS = value
  }

  private def HTTP_SERVER_DOCKER_DOCKERNAME_=(value: String): Unit = {
    _HTTP_SERVER_DOCKER_DOCKERNAME = value
  }

  private def DISKSPACE_ALARM_NUM_=(value: Long): Unit = {
    _DISKSPACE_ALARM_NUM = value
  }
  
  private def MAX_CATCH_TRANS_NUM: Int = _MAX_CATCH_TRANS_NUM

  private def MAX_CATCH_TRANS_NUM_=(value: Int): Unit = {
    _MAX_CATCH_TRANS_NUM = value
  }

  private def RETRY_TIME: Int = _RETRY_TIME
  

  private def RETRY_TIME_=(value: Int): Unit = {
    _RETRY_TIME = value
  }


  private def TRANS_CREATE_TYPE: Int = _TRANS_CREATE_TYPE

  private def TRANS_CREATE_TYPE_=(value: Int): Unit = {
    _TRANS_CREATE_TYPE = value
  }

  private def TRAN_CREATE_DUR: Int = _TRAN_CREATE_DUR

  private def TRAN_CREATE_DUR_=(value: Int): Unit = {
    _TRAN_CREATE_DUR = value
  }

  private def VOTE_NOTE_MIN: Int = _VOTE_NOTE_MIN

  private def VOTE_NOTE_MIN_=(value: Int): Unit = {
    _VOTE_NOTE_MIN = value
  }

  private def MIN_BLOCK_TRANS_NUM: Int = _MIN_BLOCK_TRANS_NUM

  private def MIN_BLOCK_TRANS_NUM_=(value: Int): Unit = {
    _MIN_BLOCK_TRANS_NUM = value
  }

  private def LIMIT_BLOCK_TRANS_NUM: Int = _LIMIT_BLOCK_TRANS_NUM

  private def LIMIT_BLOCK_TRANS_NUM_=(value: Int): Unit = {
    _LIMIT_BLOCK_TRANS_NUM = value
  }

  
  /**
    * 初始化配饰信息
    * @param config
    */
  def initConfigSystem(config:Config): Unit ={
    LIMIT_BLOCK_TRANS_NUM_=(config.getInt("system.block.trans_num_limit"))
    MIN_BLOCK_TRANS_NUM_=(config.getInt("system.block.trans_num_min"))
    RETRY_TIME_=(config.getInt("system.block.retry_time"))
    VOTE_NOTE_MIN_=(config.getInt("system.vote.vote_note_min"))
    TRAN_CREATE_DUR_=(config.getInt("system.transaction.tran_create_dur"))
    MAX_CATCH_TRANS_NUM_=(config.getInt("system.transaction.max_cache_num"))
    TRANS_CREATE_TYPE_=(config.getInt("system.trans_create_type"))
    DISKSPACE_ALARM_NUM_=(config.getInt("system.diskspaceManager.diskspacealarm"))
    SERVERPORT_=(config.getInt("system.httpServicePort"))
    HTTP_SERVER_DOCKER_URLPARAMS_=(config.getString("system.http_server_docker_urlparams"))
    HTTP_SERVER_DOCKER_DOCKERNAME_=(config.getString("system.http_server_docker_dockername"))
  }

  
  
  def getLimitBlockTransNum = LIMIT_BLOCK_TRANS_NUM

  def getMinBlockTransNum = MIN_BLOCK_TRANS_NUM

  def getVoteNoteMin = VOTE_NOTE_MIN

  def getTranCreateDur = TRAN_CREATE_DUR

  def getMaxCacheTransNum = MAX_CATCH_TRANS_NUM

  def getTransCreateType = TRANS_CREATE_TYPE

  def getRetryTime = RETRY_TIME
  
  def getDiskSpaceAlarm = DISKSPACE_ALARM_NUM
  
  def getHttpServicePort = SERVERPORT
  def getHttpServerDockerUrlParams = HTTP_SERVER_DOCKER_URLPARAMS
  def getHttpServerDockername = HTTP_SERVER_DOCKER_DOCKERNAME
}
