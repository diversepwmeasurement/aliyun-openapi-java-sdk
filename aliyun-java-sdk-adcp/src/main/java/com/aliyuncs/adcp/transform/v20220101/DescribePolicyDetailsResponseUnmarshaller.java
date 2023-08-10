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

package com.aliyuncs.adcp.transform.v20220101;

import com.aliyuncs.adcp.model.v20220101.DescribePolicyDetailsResponse;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyDetailsResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyDetailsResponseUnmarshaller {

	public static DescribePolicyDetailsResponse unmarshall(DescribePolicyDetailsResponse describePolicyDetailsResponse, UnmarshallerContext _ctx) {
		
		describePolicyDetailsResponse.setRequestId(_ctx.stringValue("DescribePolicyDetailsResponse.RequestId"));

		Policy policy = new Policy();
		policy.setName(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Name"));
		policy.setCategory(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Category"));
		policy.setDescription(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Description"));
		policy.setAction(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Action"));
		policy.setSeverity(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Severity"));
		policy.setTemplate(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Template"));
		policy.setNoConfig(_ctx.integerValue("DescribePolicyDetailsResponse.Policy.NoConfig"));
		policy.setCreated(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Created"));
		policy.setUpdated(_ctx.stringValue("DescribePolicyDetailsResponse.Policy.Updated"));
		describePolicyDetailsResponse.setPolicy(policy);
	 
	 	return describePolicyDetailsResponse;
	}
}