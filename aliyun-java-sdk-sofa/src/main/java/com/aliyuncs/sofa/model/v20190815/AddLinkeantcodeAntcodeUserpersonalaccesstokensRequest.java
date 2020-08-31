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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeantcodeAntcodeUserpersonalaccesstokensRequest extends RpcAcsRequest<AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse> {
	   

	private String paramJsonStr;

	private String requestGitOperate;
	public AddLinkeantcodeAntcodeUserpersonalaccesstokensRequest() {
		super("SOFA", "2019-08-15", "AddLinkeantcodeAntcodeUserpersonalaccesstokens", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParamJsonStr() {
		return this.paramJsonStr;
	}

	public void setParamJsonStr(String paramJsonStr) {
		this.paramJsonStr = paramJsonStr;
		if(paramJsonStr != null){
			putBodyParameter("ParamJsonStr", paramJsonStr);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	@Override
	public Class<AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse> getResponseClass() {
		return AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.class;
	}

}