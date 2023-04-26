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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateErRouteMapRequest extends RpcAcsRequest<UpdateErRouteMapResponse> {
	   

	private String erId;

	private String description;

	private String erRouteMapId;
	public UpdateErRouteMapRequest() {
		super("eflo", "2022-05-30", "UpdateErRouteMap", "eflo");
		setMethod(MethodType.POST);
	}

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getErRouteMapId() {
		return this.erRouteMapId;
	}

	public void setErRouteMapId(String erRouteMapId) {
		this.erRouteMapId = erRouteMapId;
		if(erRouteMapId != null){
			putBodyParameter("ErRouteMapId", erRouteMapId);
		}
	}

	@Override
	public Class<UpdateErRouteMapResponse> getResponseClass() {
		return UpdateErRouteMapResponse.class;
	}

}
