/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.config.transform.v20190108;

import com.aliyuncs.config.model.v20190108.PutConfigRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutConfigRuleResponseUnmarshaller {

	public static PutConfigRuleResponse unmarshall(PutConfigRuleResponse putConfigRuleResponse, UnmarshallerContext _ctx) {
		
		putConfigRuleResponse.setRequestId(_ctx.stringValue("PutConfigRuleResponse.RequestId"));
		putConfigRuleResponse.setConfigRuleId(_ctx.stringValue("PutConfigRuleResponse.ConfigRuleId"));
	 
	 	return putConfigRuleResponse;
	}
}