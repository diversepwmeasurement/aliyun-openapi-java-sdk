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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAuthenticationLogsRequest extends RpcAcsRequest<ListAuthenticationLogsResponse> {
	   

	private Long toTime;

	private String userId;

	private String logTag;

	private Long pageNumber;

	private Long pageSize;

	private String credentialId;

	private Long fromTime;

	private String authenticatorUuid;

	private String authenticatorType;

	private String applicationExternalId;
	public ListAuthenticationLogsRequest() {
		super("idaas-doraemon", "2021-05-20", "ListAuthenticationLogs", "idaasauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getToTime() {
		return this.toTime;
	}

	public void setToTime(Long toTime) {
		this.toTime = toTime;
		if(toTime != null){
			putQueryParameter("ToTime", toTime.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getLogTag() {
		return this.logTag;
	}

	public void setLogTag(String logTag) {
		this.logTag = logTag;
		if(logTag != null){
			putQueryParameter("LogTag", logTag);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCredentialId() {
		return this.credentialId;
	}

	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
		if(credentialId != null){
			putQueryParameter("CredentialId", credentialId);
		}
	}

	public Long getFromTime() {
		return this.fromTime;
	}

	public void setFromTime(Long fromTime) {
		this.fromTime = fromTime;
		if(fromTime != null){
			putQueryParameter("FromTime", fromTime.toString());
		}
	}

	public String getAuthenticatorUuid() {
		return this.authenticatorUuid;
	}

	public void setAuthenticatorUuid(String authenticatorUuid) {
		this.authenticatorUuid = authenticatorUuid;
		if(authenticatorUuid != null){
			putQueryParameter("AuthenticatorUuid", authenticatorUuid);
		}
	}

	public String getAuthenticatorType() {
		return this.authenticatorType;
	}

	public void setAuthenticatorType(String authenticatorType) {
		this.authenticatorType = authenticatorType;
		if(authenticatorType != null){
			putQueryParameter("AuthenticatorType", authenticatorType);
		}
	}

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	@Override
	public Class<ListAuthenticationLogsResponse> getResponseClass() {
		return ListAuthenticationLogsResponse.class;
	}

}
