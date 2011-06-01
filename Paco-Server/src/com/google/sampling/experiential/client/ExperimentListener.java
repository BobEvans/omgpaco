/*
* Copyright 2011 Google Inc. All Rights Reserved.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance  with the License.  
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package com.google.sampling.experiential.client;

import com.google.sampling.experiential.shared.ExperimentDAO;

/**
 * A narrow interface for the actions available to do on 
 * experiments in the administered and joined views.
 * 
 * @author Bob Evans
 *
 */
public interface ExperimentListener {
  public static final int STATS_CODE = 1;
  public static final int CHARTS_CODE = 2;
  public static final int CSV_CODE = 3;
  public static final int DELETE_CODE = 4;
  public static final int EDIT_CODE = 5;
  public static final int SAVED = 6;
  public static final int CANCELED = 7;
  public static final int SOFT_DELETE_CODE = 8;

  void eventFired(int experimentCode, ExperimentDAO experiment, boolean joined);
}
