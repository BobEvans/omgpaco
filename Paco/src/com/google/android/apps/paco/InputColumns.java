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
/**
 * 
 */
package com.google.android.apps.paco;

import android.net.Uri;
import android.provider.BaseColumns;

public class InputColumns implements BaseColumns {
  public static final String EXPERIMENT_ID = "experiment_id";
  public static final String SERVER_ID = "question_id";
  public static final String NAME = "name";
  public static final String TEXT = "text";
  public static final String MANDATORY = "mandatory";
  public static final String QUESTION_TYPE = "question_type";
  public static final String RESPONSE_TYPE = "response_type";
  public static final String LIKERT_STEPS = "likert_steps";
  public static final String LEFT_SIDE_LABEL = "left_side_label";
  public static final String RIGHT_SIDE_LABEL = "right_side_label";
  public static final String LIST_CHOICES_JSON = "list_choices";
  public static final String SCHEDULED_DATE = "scheduledDate";
  public static final String CONDITIONAL = "conditional";
  public static final String CONDITIONAL_EXPRESSION = "condition_expression";
  public static final String MULTISELECT = "multiselect";
  
  public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.paco.input";
  public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.paco.input";
  
  public static final Uri CONTENT_URI = Uri.parse("content://"+ExperimentProviderUtil.AUTHORITY+"/inputs");
  
  

}