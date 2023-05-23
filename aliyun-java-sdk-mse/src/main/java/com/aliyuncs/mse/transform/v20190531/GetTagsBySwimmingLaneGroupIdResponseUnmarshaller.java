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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetTagsBySwimmingLaneGroupIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTagsBySwimmingLaneGroupIdResponseUnmarshaller {

	public static GetTagsBySwimmingLaneGroupIdResponse unmarshall(GetTagsBySwimmingLaneGroupIdResponse getTagsBySwimmingLaneGroupIdResponse, UnmarshallerContext _ctx) {
		
		getTagsBySwimmingLaneGroupIdResponse.setRequestId(_ctx.stringValue("GetTagsBySwimmingLaneGroupIdResponse.RequestId"));
		getTagsBySwimmingLaneGroupIdResponse.setSuccess(_ctx.booleanValue("GetTagsBySwimmingLaneGroupIdResponse.Success"));
		getTagsBySwimmingLaneGroupIdResponse.setErrorCode(_ctx.stringValue("GetTagsBySwimmingLaneGroupIdResponse.ErrorCode"));
		getTagsBySwimmingLaneGroupIdResponse.setMessage(_ctx.stringValue("GetTagsBySwimmingLaneGroupIdResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTagsBySwimmingLaneGroupIdResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetTagsBySwimmingLaneGroupIdResponse.Data["+ i +"]"));
		}
		getTagsBySwimmingLaneGroupIdResponse.setData(data);
	 
	 	return getTagsBySwimmingLaneGroupIdResponse;
	}
}