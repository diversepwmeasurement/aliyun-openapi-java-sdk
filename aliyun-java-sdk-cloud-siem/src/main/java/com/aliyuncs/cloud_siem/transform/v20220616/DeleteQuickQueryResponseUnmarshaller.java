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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DeleteQuickQueryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQuickQueryResponseUnmarshaller {

	public static DeleteQuickQueryResponse unmarshall(DeleteQuickQueryResponse deleteQuickQueryResponse, UnmarshallerContext _ctx) {
		
		deleteQuickQueryResponse.setRequestId(_ctx.stringValue("DeleteQuickQueryResponse.RequestId"));
		deleteQuickQueryResponse.setData(_ctx.booleanValue("DeleteQuickQueryResponse.Data"));
		deleteQuickQueryResponse.setSuccess(_ctx.booleanValue("DeleteQuickQueryResponse.Success"));
		deleteQuickQueryResponse.setCode(_ctx.integerValue("DeleteQuickQueryResponse.Code"));
		deleteQuickQueryResponse.setMessage(_ctx.stringValue("DeleteQuickQueryResponse.Message"));
		deleteQuickQueryResponse.setErrCode(_ctx.stringValue("DeleteQuickQueryResponse.ErrCode"));
		deleteQuickQueryResponse.setDyCode(_ctx.stringValue("DeleteQuickQueryResponse.DyCode"));
		deleteQuickQueryResponse.setDyMessage(_ctx.stringValue("DeleteQuickQueryResponse.DyMessage"));
	 
	 	return deleteQuickQueryResponse;
	}
}