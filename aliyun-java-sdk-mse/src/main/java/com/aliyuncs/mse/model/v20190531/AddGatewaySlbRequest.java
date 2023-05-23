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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGatewaySlbRequest extends RpcAcsRequest<AddGatewaySlbResponse> {
	   

	private String slbId;

	private String gatewayUniqueId;

	private String type;

	private Integer httpPort;

	private Integer serviceWeight;

	private String vServerGroupId;

	@SerializedName("vServiceList")
	private List<VServiceList> vServiceList;

	private String httpsVServerGroupId;

	private String acceptLanguage;

	private Integer httpsPort;
	public AddGatewaySlbRequest() {
		super("mse", "2019-05-31", "AddGatewaySlb", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSlbId() {
		return this.slbId;
	}

	public void setSlbId(String slbId) {
		this.slbId = slbId;
		if(slbId != null){
			putQueryParameter("SlbId", slbId);
		}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getHttpPort() {
		return this.httpPort;
	}

	public void setHttpPort(Integer httpPort) {
		this.httpPort = httpPort;
		if(httpPort != null){
			putQueryParameter("HttpPort", httpPort.toString());
		}
	}

	public Integer getServiceWeight() {
		return this.serviceWeight;
	}

	public void setServiceWeight(Integer serviceWeight) {
		this.serviceWeight = serviceWeight;
		if(serviceWeight != null){
			putQueryParameter("ServiceWeight", serviceWeight.toString());
		}
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public List<VServiceList> getVServiceList() {
		return this.vServiceList;
	}

	public void setVServiceList(List<VServiceList> vServiceList) {
		this.vServiceList = vServiceList;	
		if (vServiceList != null) {
			putQueryParameter("VServiceList" , new Gson().toJson(vServiceList));
		}	
	}

	public String getHttpsVServerGroupId() {
		return this.httpsVServerGroupId;
	}

	public void setHttpsVServerGroupId(String httpsVServerGroupId) {
		this.httpsVServerGroupId = httpsVServerGroupId;
		if(httpsVServerGroupId != null){
			putQueryParameter("HttpsVServerGroupId", httpsVServerGroupId);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Integer getHttpsPort() {
		return this.httpsPort;
	}

	public void setHttpsPort(Integer httpsPort) {
		this.httpsPort = httpsPort;
		if(httpsPort != null){
			putQueryParameter("HttpsPort", httpsPort.toString());
		}
	}

	public static class VServiceList {

		@SerializedName("VServerGroupId")
		private String vServerGroupId;

		@SerializedName("Protocol")
		private String protocol;

		@SerializedName("Port")
		private Integer port;

		@SerializedName("VServerGroupName")
		private String vServerGroupName;

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getVServerGroupName() {
			return this.vServerGroupName;
		}

		public void setVServerGroupName(String vServerGroupName) {
			this.vServerGroupName = vServerGroupName;
		}
	}

	@Override
	public Class<AddGatewaySlbResponse> getResponseClass() {
		return AddGatewaySlbResponse.class;
	}

}
