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

import com.aliyuncs.cloud_siem.model.v20220616.OpenDeliveryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenDeliveryResponseUnmarshaller {

	public static OpenDeliveryResponse unmarshall(OpenDeliveryResponse openDeliveryResponse, UnmarshallerContext _ctx) {
		
		openDeliveryResponse.setRequestId(_ctx.stringValue("OpenDeliveryResponse.RequestId"));
		openDeliveryResponse.setData(_ctx.booleanValue("OpenDeliveryResponse.Data"));
		openDeliveryResponse.setSuccess(_ctx.booleanValue("OpenDeliveryResponse.Success"));
		openDeliveryResponse.setCode(_ctx.integerValue("OpenDeliveryResponse.Code"));
		openDeliveryResponse.setMessage(_ctx.stringValue("OpenDeliveryResponse.Message"));
		openDeliveryResponse.setErrCode(_ctx.stringValue("OpenDeliveryResponse.ErrCode"));
		openDeliveryResponse.setDyCode(_ctx.stringValue("OpenDeliveryResponse.DyCode"));
		openDeliveryResponse.setDyMessage(_ctx.stringValue("OpenDeliveryResponse.DyMessage"));
	 
	 	return openDeliveryResponse;
	}
}