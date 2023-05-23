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
public class CreateOrUpdateSwimmingLaneRequest extends RpcAcsRequest<CreateOrUpdateSwimmingLaneResponse> {
	   

	private String entryRule;

	private Boolean enable;

	private Long id;

	private String tag;

	private List<EntryRules> entryRuless;

	private Long groupId;

	private Boolean enableRules;

	private String name;

	@SerializedName("gatewaySwimmingLaneRouteJson")
	private GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

	private String namespace;

	private String acceptLanguage;
	public CreateOrUpdateSwimmingLaneRequest() {
		super("mse", "2019-05-31", "CreateOrUpdateSwimmingLane", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntryRule() {
		return this.entryRule;
	}

	public void setEntryRule(String entryRule) {
		this.entryRule = entryRule;
		if(entryRule != null){
			putQueryParameter("EntryRule", entryRule);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public List<EntryRules> getEntryRuless() {
		return this.entryRuless;
	}

	public void setEntryRuless(List<EntryRules> entryRuless) {
		this.entryRuless = entryRuless;	
		if (entryRuless != null) {
			for (int depth1 = 0; depth1 < entryRuless.size(); depth1++) {
				if (entryRuless.get(depth1).getRestItemss() != null) {
					for (int depth2 = 0; depth2 < entryRuless.get(depth1).getRestItemss().size(); depth2++) {
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Datum" , entryRuless.get(depth1).getRestItemss().get(depth2).getDatum());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Divisor" , entryRuless.get(depth1).getRestItemss().get(depth2).getDivisor());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Rate" , entryRuless.get(depth1).getRestItemss().get(depth2).getRate());
						if (entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists() != null) {
							for (int i = 0; i < entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists().size(); i++) {
								putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".NameList." + (i + 1) , entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists().get(i));
							}
						}
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Name" , entryRuless.get(depth1).getRestItemss().get(depth2).getName());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Type" , entryRuless.get(depth1).getRestItemss().get(depth2).getType());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Cond" , entryRuless.get(depth1).getRestItemss().get(depth2).getCond());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Remainder" , entryRuless.get(depth1).getRestItemss().get(depth2).getRemainder());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Value" , entryRuless.get(depth1).getRestItemss().get(depth2).getValue());
						putBodyParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Operator" , entryRuless.get(depth1).getRestItemss().get(depth2).getOperator());
					}
				}
				putBodyParameter("EntryRules." + (depth1 + 1) + ".Condition" , entryRuless.get(depth1).getCondition());
				if (entryRuless.get(depth1).getPathss() != null) {
					for (int i = 0; i < entryRuless.get(depth1).getPathss().size(); i++) {
						putBodyParameter("EntryRules." + (depth1 + 1) + ".Paths." + (i + 1) , entryRuless.get(depth1).getPathss().get(i));
					}
				}
				putBodyParameter("EntryRules." + (depth1 + 1) + ".Priority" , entryRuless.get(depth1).getPriority());
			}
		}	
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public Boolean getEnableRules() {
		return this.enableRules;
	}

	public void setEnableRules(Boolean enableRules) {
		this.enableRules = enableRules;
		if(enableRules != null){
			putQueryParameter("EnableRules", enableRules.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public GatewaySwimmingLaneRouteJson getGatewaySwimmingLaneRouteJson() {
		return this.gatewaySwimmingLaneRouteJson;
	}

	public void setGatewaySwimmingLaneRouteJson(GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson) {
		this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;	
		if (gatewaySwimmingLaneRouteJson != null) {
			putQueryParameter("GatewaySwimmingLaneRouteJson" , new Gson().toJson(gatewaySwimmingLaneRouteJson));
		}	
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public static class EntryRules {

		private List<RestItems> restItemss;

		private String condition;

		private List<String> pathss;

		private Integer priority;

		public List<RestItems> getRestItemss() {
			return this.restItemss;
		}

		public void setRestItemss(List<RestItems> restItemss) {
			this.restItemss = restItemss;
		}

		public String getCondition() {
			return this.condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public List<String> getPathss() {
			return this.pathss;
		}

		public void setPathss(List<String> pathss) {
			this.pathss = pathss;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public static class RestItems {

			private String datum;

			private Integer divisor;

			private Integer rate;

			private List<String> nameLists;

			private String name;

			private String type;

			private String cond;

			private Integer remainder;

			private String value;

			private String operator;

			public String getDatum() {
				return this.datum;
			}

			public void setDatum(String datum) {
				this.datum = datum;
			}

			public Integer getDivisor() {
				return this.divisor;
			}

			public void setDivisor(Integer divisor) {
				this.divisor = divisor;
			}

			public Integer getRate() {
				return this.rate;
			}

			public void setRate(Integer rate) {
				this.rate = rate;
			}

			public List<String> getNameLists() {
				return this.nameLists;
			}

			public void setNameLists(List<String> nameLists) {
				this.nameLists = nameLists;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCond() {
				return this.cond;
			}

			public void setCond(String cond) {
				this.cond = cond;
			}

			public Integer getRemainder() {
				return this.remainder;
			}

			public void setRemainder(Integer remainder) {
				this.remainder = remainder;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	public static class GatewaySwimmingLaneRouteJson {

		@SerializedName("GatewayUniqueId")
		private String gatewayUniqueId;

		@SerializedName("RouteIdList")
		private List<Long> routeIdList;

		@SerializedName("Conditions")
		private List<ConditionsItem> conditions;

		@SerializedName("GatewayId")
		private Long gatewayId;

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public List<Long> getRouteIdList() {
			return this.routeIdList;
		}

		public void setRouteIdList(List<Long> routeIdList) {
			this.routeIdList = routeIdList;
		}

		public List<ConditionsItem> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<ConditionsItem> conditions) {
			this.conditions = conditions;
		}

		public Long getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(Long gatewayId) {
			this.gatewayId = gatewayId;
		}

		public static class ConditionsItem {

			@SerializedName("Name")
			private String name;

			@SerializedName("Type")
			private String type;

			@SerializedName("Cond")
			private String cond;

			@SerializedName("Value")
			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCond() {
				return this.cond;
			}

			public void setCond(String cond) {
				this.cond = cond;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<CreateOrUpdateSwimmingLaneResponse> getResponseClass() {
		return CreateOrUpdateSwimmingLaneResponse.class;
	}

}
