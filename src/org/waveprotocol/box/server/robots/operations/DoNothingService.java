/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.box.server.robots.operations;

import com.google.common.collect.Maps;
import com.google.wave.api.OperationRequest;
import com.google.wave.api.JsonRpcConstant.ParamsProperty;

import org.waveprotocol.box.server.robots.OperationContext;
import org.waveprotocol.wave.model.wave.ParticipantId;

/**
 * {@link OperationService} that just returns an empty response. Used for
 * robot.notify operation in the active robot and data api where we inspect this
 * operation to see which protocol version it uses but not produce any results.
 *
 * @author ljvderijk@google.com (Lennard de Rijk)
 */
public final class DoNothingService implements OperationService {

  public static DoNothingService create() {
    return new DoNothingService();
  }

  private DoNothingService() {
  }

  @Override
  public void execute(
      OperationRequest operation, OperationContext context, ParticipantId participant) {
    context.constructResponse(operation, Maps.<ParamsProperty, Object> newHashMap());
  }
}
