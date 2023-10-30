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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveMessageGroupRequest extends RpcAcsRequest<CreateLiveMessageGroupResponse> {
	   

	private String groupId;

	private String groupInfo;

	private String creatorId;

	private String dataCenter;

	private String groupName;

	private String appId;

	private List<String> administrators;
	public CreateLiveMessageGroupRequest() {
		super("live", "2016-11-01", "CreateLiveMessageGroup", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getGroupInfo() {
		return this.groupInfo;
	}

	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
		if(groupInfo != null){
			putQueryParameter("GroupInfo", groupInfo);
		}
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putQueryParameter("CreatorId", creatorId);
		}
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public List<String> getAdministrators() {
		return this.administrators;
	}

	public void setAdministrators(List<String> administrators) {
		this.administrators = administrators;	
		if (administrators != null) {
			String administratorsArrVal = "";
			for(int depth1 = 0; depth1 < administrators.size(); depth1++) {
				administratorsArrVal += administrators.get(depth1) + ",";
			}
			if (administratorsArrVal.length() > 0) {
				administratorsArrVal = administratorsArrVal.substring(0, administratorsArrVal.length() - 1);
			}
			putQueryParameter("Administrators" , administratorsArrVal);
		}	
	}

	@Override
	public Class<CreateLiveMessageGroupResponse> getResponseClass() {
		return CreateLiveMessageGroupResponse.class;
	}

}
