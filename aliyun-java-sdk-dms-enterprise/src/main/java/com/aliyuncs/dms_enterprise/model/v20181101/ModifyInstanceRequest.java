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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceRequest extends RpcAcsRequest<ModifyInstanceResponse> {
	   

	private String ecsRegion;

	private String networkType;

	private Long tid;

	private Integer useSsl;

	private String enableSellCommon;

	private String enableSellSitd;

	private String instanceSource;

	private String envType;

	private String host;

	private Integer queryTimeout;

	private String ecsInstanceId;

	private Integer exportTimeout;

	private Long templateId;

	private String enableSellTrust;

	private String instanceId;

	private Integer port;

	private String safeRule;

	private Integer ddlOnline;

	private Integer useDsql;

	private String enableSellStable;

	private String sid;

	private Long dbaId;

	private String dataLinkName;

	private String templateType;

	private String instanceType;

	private String databasePassword;

	private String instanceAlias;

	private String databaseUser;

	private String vpcId;

	private Boolean skipTest;
	public ModifyInstanceRequest() {
		super("dms-enterprise", "2018-11-01", "ModifyInstance", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEcsRegion() {
		return this.ecsRegion;
	}

	public void setEcsRegion(String ecsRegion) {
		this.ecsRegion = ecsRegion;
		if(ecsRegion != null){
			putQueryParameter("EcsRegion", ecsRegion);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Integer getUseSsl() {
		return this.useSsl;
	}

	public void setUseSsl(Integer useSsl) {
		this.useSsl = useSsl;
		if(useSsl != null){
			putQueryParameter("UseSsl", useSsl.toString());
		}
	}

	public String getEnableSellCommon() {
		return this.enableSellCommon;
	}

	public void setEnableSellCommon(String enableSellCommon) {
		this.enableSellCommon = enableSellCommon;
		if(enableSellCommon != null){
			putQueryParameter("EnableSellCommon", enableSellCommon);
		}
	}

	public String getEnableSellSitd() {
		return this.enableSellSitd;
	}

	public void setEnableSellSitd(String enableSellSitd) {
		this.enableSellSitd = enableSellSitd;
		if(enableSellSitd != null){
			putQueryParameter("EnableSellSitd", enableSellSitd);
		}
	}

	public String getInstanceSource() {
		return this.instanceSource;
	}

	public void setInstanceSource(String instanceSource) {
		this.instanceSource = instanceSource;
		if(instanceSource != null){
			putQueryParameter("InstanceSource", instanceSource);
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType);
		}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putQueryParameter("Host", host);
		}
	}

	public Integer getQueryTimeout() {
		return this.queryTimeout;
	}

	public void setQueryTimeout(Integer queryTimeout) {
		this.queryTimeout = queryTimeout;
		if(queryTimeout != null){
			putQueryParameter("QueryTimeout", queryTimeout.toString());
		}
	}

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public Integer getExportTimeout() {
		return this.exportTimeout;
	}

	public void setExportTimeout(Integer exportTimeout) {
		this.exportTimeout = exportTimeout;
		if(exportTimeout != null){
			putQueryParameter("ExportTimeout", exportTimeout.toString());
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public String getEnableSellTrust() {
		return this.enableSellTrust;
	}

	public void setEnableSellTrust(String enableSellTrust) {
		this.enableSellTrust = enableSellTrust;
		if(enableSellTrust != null){
			putQueryParameter("EnableSellTrust", enableSellTrust);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getSafeRule() {
		return this.safeRule;
	}

	public void setSafeRule(String safeRule) {
		this.safeRule = safeRule;
		if(safeRule != null){
			putQueryParameter("SafeRule", safeRule);
		}
	}

	public Integer getDdlOnline() {
		return this.ddlOnline;
	}

	public void setDdlOnline(Integer ddlOnline) {
		this.ddlOnline = ddlOnline;
		if(ddlOnline != null){
			putQueryParameter("DdlOnline", ddlOnline.toString());
		}
	}

	public Integer getUseDsql() {
		return this.useDsql;
	}

	public void setUseDsql(Integer useDsql) {
		this.useDsql = useDsql;
		if(useDsql != null){
			putQueryParameter("UseDsql", useDsql.toString());
		}
	}

	public String getEnableSellStable() {
		return this.enableSellStable;
	}

	public void setEnableSellStable(String enableSellStable) {
		this.enableSellStable = enableSellStable;
		if(enableSellStable != null){
			putQueryParameter("EnableSellStable", enableSellStable);
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
		}
	}

	public Long getDbaId() {
		return this.dbaId;
	}

	public void setDbaId(Long dbaId) {
		this.dbaId = dbaId;
		if(dbaId != null){
			putQueryParameter("DbaId", dbaId.toString());
		}
	}

	public String getDataLinkName() {
		return this.dataLinkName;
	}

	public void setDataLinkName(String dataLinkName) {
		this.dataLinkName = dataLinkName;
		if(dataLinkName != null){
			putQueryParameter("DataLinkName", dataLinkName);
		}
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDatabasePassword() {
		return this.databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
		if(databasePassword != null){
			putQueryParameter("DatabasePassword", databasePassword);
		}
	}

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
		if(instanceAlias != null){
			putQueryParameter("InstanceAlias", instanceAlias);
		}
	}

	public String getDatabaseUser() {
		return this.databaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
		if(databaseUser != null){
			putQueryParameter("DatabaseUser", databaseUser);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Boolean getSkipTest() {
		return this.skipTest;
	}

	public void setSkipTest(Boolean skipTest) {
		this.skipTest = skipTest;
		if(skipTest != null){
			putQueryParameter("SkipTest", skipTest.toString());
		}
	}

	@Override
	public Class<ModifyInstanceResponse> getResponseClass() {
		return ModifyInstanceResponse.class;
	}

}
