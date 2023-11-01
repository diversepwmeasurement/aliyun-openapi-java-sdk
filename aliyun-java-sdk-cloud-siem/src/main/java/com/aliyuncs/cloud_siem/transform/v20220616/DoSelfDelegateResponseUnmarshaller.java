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

import com.aliyuncs.cloud_siem.model.v20220616.DoSelfDelegateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoSelfDelegateResponseUnmarshaller {

	public static DoSelfDelegateResponse unmarshall(DoSelfDelegateResponse doSelfDelegateResponse, UnmarshallerContext _ctx) {
		
		doSelfDelegateResponse.setRequestId(_ctx.stringValue("DoSelfDelegateResponse.RequestId"));
		doSelfDelegateResponse.setData(_ctx.booleanValue("DoSelfDelegateResponse.Data"));
		doSelfDelegateResponse.setSuccess(_ctx.booleanValue("DoSelfDelegateResponse.Success"));
		doSelfDelegateResponse.setCode(_ctx.integerValue("DoSelfDelegateResponse.Code"));
		doSelfDelegateResponse.setMessage(_ctx.stringValue("DoSelfDelegateResponse.Message"));
		doSelfDelegateResponse.setErrCode(_ctx.stringValue("DoSelfDelegateResponse.ErrCode"));
		doSelfDelegateResponse.setDyCode(_ctx.stringValue("DoSelfDelegateResponse.DyCode"));
		doSelfDelegateResponse.setDyMessage(_ctx.stringValue("DoSelfDelegateResponse.DyMessage"));
	 
	 	return doSelfDelegateResponse;
	}
}