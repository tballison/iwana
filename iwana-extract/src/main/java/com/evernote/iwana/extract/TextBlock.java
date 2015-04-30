/**
 * Copyright 2014,2015 Evernote Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.evernote.iwana.extract;

import java.util.List;

import com.evernote.iwana.pb.TSWP.TSWPArchives.ObjectAttributeTable.ObjectAttribute;

/**
 * A temporary buffer for text.
 */
final class TextBlock {
  CharSequence text;
  List<ObjectAttribute> objectAttributes = null;
  boolean done = false;

  /**
   * Returns the text in this {@link TextBlock} as a String, and removes it from this
   * object.
   * 
   * @return The text for this {@link TextBlock}.
   */
  String flushText() {
    String t = text.toString();
    this.text = null;
    return t;
  }
}