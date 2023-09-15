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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.ModifyChatappTemplateResponse;
import com.aliyuncs.cams.model.v20200606.ModifyChatappTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyChatappTemplateResponseUnmarshaller {

	public static ModifyChatappTemplateResponse unmarshall(ModifyChatappTemplateResponse modifyChatappTemplateResponse, UnmarshallerContext _ctx) {
		
		modifyChatappTemplateResponse.setRequestId(_ctx.stringValue("ModifyChatappTemplateResponse.RequestId"));
		modifyChatappTemplateResponse.setCode(_ctx.stringValue("ModifyChatappTemplateResponse.Code"));
		modifyChatappTemplateResponse.setMessage(_ctx.stringValue("ModifyChatappTemplateResponse.Message"));
		modifyChatappTemplateResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyChatappTemplateResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setTemplateCode(_ctx.stringValue("ModifyChatappTemplateResponse.Data.TemplateCode"));
		data.setTemplateName(_ctx.stringValue("ModifyChatappTemplateResponse.Data.TemplateName"));
		modifyChatappTemplateResponse.setData(data);
	 
	 	return modifyChatappTemplateResponse;
	}
}