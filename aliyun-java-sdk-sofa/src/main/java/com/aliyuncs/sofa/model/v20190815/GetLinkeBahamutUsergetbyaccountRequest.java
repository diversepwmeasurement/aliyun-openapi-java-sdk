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
public class GetLinkeBahamutUsergetbyaccountRequest extends RpcAcsRequest<GetLinkeBahamutUsergetbyaccountResponse> {
	   

	private String tenantExternalId;

	private String account;
	public GetLinkeBahamutUsergetbyaccountRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutUsergetbyaccount", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantExternalId() {
		return this.tenantExternalId;
	}

	public void setTenantExternalId(String tenantExternalId) {
		this.tenantExternalId = tenantExternalId;
		if(tenantExternalId != null){
			putBodyParameter("TenantExternalId", tenantExternalId);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	@Override
	public Class<GetLinkeBahamutUsergetbyaccountResponse> getResponseClass() {
		return GetLinkeBahamutUsergetbyaccountResponse.class;
	}

}