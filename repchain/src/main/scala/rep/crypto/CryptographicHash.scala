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

package rep.crypto

/**
 * @author c4w
 */
trait CryptographicHash {

  type Digest = Array[Byte]
  type Message = Array[Byte]

  val DigestSize: Int // in bytes

  def apply(input: Message): Digest = hash(input)

  def apply(input: String): Digest = hash(input.getBytes)

  def hash(input: Message): Digest

  def hash(input: String): Digest = hash(input.getBytes)
}

