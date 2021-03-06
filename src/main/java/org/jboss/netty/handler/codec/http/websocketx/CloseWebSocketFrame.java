/*
 * Copyright 2010 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jboss.netty.handler.codec.http.websocketx;

import org.jboss.netty.buffer.ChannelBuffers;

/**
 * Web Socket Frame for closing the connection
 * 
 * @author <a href="http://www.veebsbraindump.com/">Vibul Imtarnasan</a>
 */
public class CloseWebSocketFrame extends WebSocketFrame {

	/**
	 * Creates a new empty close frame.
	 */
	public CloseWebSocketFrame() {
		this.setBinaryData(ChannelBuffers.EMPTY_BUFFER);
	}

	/**
	 * Creates a new close frame
	 * 
	 * @param finalFragment
	 *            flag indicating if this frame is the final fragment
	 * @param rsv
	 *            reserved bits used for protocol extensions
	 */
	public CloseWebSocketFrame(boolean finalFragment, int rsv) {
		this.setFinalFragment(finalFragment);
		this.setRsv(rsv);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
