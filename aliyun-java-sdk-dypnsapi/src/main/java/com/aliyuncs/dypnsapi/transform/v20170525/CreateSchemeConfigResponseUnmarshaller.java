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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.CreateSchemeConfigResponse;
import com.aliyuncs.dypnsapi.model.v20170525.CreateSchemeConfigResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSchemeConfigResponseUnmarshaller {

	public static CreateSchemeConfigResponse unmarshall(CreateSchemeConfigResponse createSchemeConfigResponse, UnmarshallerContext _ctx) {
		
		createSchemeConfigResponse.setRequestId(_ctx.stringValue("CreateSchemeConfigResponse.RequestId"));
		createSchemeConfigResponse.setMessage(_ctx.stringValue("CreateSchemeConfigResponse.Message"));
		createSchemeConfigResponse.setCode(_ctx.stringValue("CreateSchemeConfigResponse.Code"));
		createSchemeConfigResponse.setSuccess(_ctx.booleanValue("CreateSchemeConfigResponse.Success"));

		Model model = new Model();
		model.setSchemeCode(_ctx.stringValue("CreateSchemeConfigResponse.Model.SchemeCode"));
		createSchemeConfigResponse.setModel(model);
	 
	 	return createSchemeConfigResponse;
	}
}