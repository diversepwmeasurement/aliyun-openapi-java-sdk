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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAnalysisResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAnalysisResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberAnalysisResponseUnmarshaller {

	public static DescribePhoneNumberAnalysisResponse unmarshall(DescribePhoneNumberAnalysisResponse describePhoneNumberAnalysisResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberAnalysisResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.RequestId"));
		describePhoneNumberAnalysisResponse.setMessage(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Message"));
		describePhoneNumberAnalysisResponse.setCode(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Code"));

		Data data = new Data();
		data.setNumber(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Data.Number"));
		data.setCode(_ctx.stringValue("DescribePhoneNumberAnalysisResponse.Data.Code"));
		describePhoneNumberAnalysisResponse.setData(data);
	 
	 	return describePhoneNumberAnalysisResponse;
	}
}