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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListShiftPersonnelsRequest extends RpcAcsRequest<ListShiftPersonnelsResponse> {
	   

	private String shiftPersonUID;

	private String userType;

	private Long endTime;

	private Long beginTime;

	private String shiftScheduleIdentifier;
	public ListShiftPersonnelsRequest() {
		super("dataworks-public", "2020-05-18", "ListShiftPersonnels");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getShiftPersonUID() {
		return this.shiftPersonUID;
	}

	public void setShiftPersonUID(String shiftPersonUID) {
		this.shiftPersonUID = shiftPersonUID;
		if(shiftPersonUID != null){
			putBodyParameter("ShiftPersonUID", shiftPersonUID);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putBodyParameter("UserType", userType);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putBodyParameter("BeginTime", beginTime.toString());
		}
	}

	public String getShiftScheduleIdentifier() {
		return this.shiftScheduleIdentifier;
	}

	public void setShiftScheduleIdentifier(String shiftScheduleIdentifier) {
		this.shiftScheduleIdentifier = shiftScheduleIdentifier;
		if(shiftScheduleIdentifier != null){
			putBodyParameter("ShiftScheduleIdentifier", shiftScheduleIdentifier);
		}
	}

	@Override
	public Class<ListShiftPersonnelsResponse> getResponseClass() {
		return ListShiftPersonnelsResponse.class;
	}

}
