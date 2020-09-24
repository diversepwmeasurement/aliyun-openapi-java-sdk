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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.CreateEPInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEPInstanceResponseUnmarshaller {

	public static CreateEPInstanceResponse unmarshall(CreateEPInstanceResponse createEPInstanceResponse, UnmarshallerContext _ctx) {
		
		createEPInstanceResponse.setRequestId(_ctx.stringValue("CreateEPInstanceResponse.RequestId"));
		createEPInstanceResponse.setEPNInstanceId(_ctx.stringValue("CreateEPInstanceResponse.EPNInstanceId"));
	 
	 	return createEPInstanceResponse;
	}
}