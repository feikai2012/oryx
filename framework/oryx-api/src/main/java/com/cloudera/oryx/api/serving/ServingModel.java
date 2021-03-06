/*
 * Copyright (c) 2015, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.oryx.api.serving;

/**
 * Interface that all Serving Layer in-memory models implement.
 *
 * @since 2.0.0
 */
public interface ServingModel {

  /**
   * @return fraction of IDs that were expected to be in the model whose value has been
   *  loaded from an update
   * @since 2.0.0
   */
  float getFractionLoaded();

}
