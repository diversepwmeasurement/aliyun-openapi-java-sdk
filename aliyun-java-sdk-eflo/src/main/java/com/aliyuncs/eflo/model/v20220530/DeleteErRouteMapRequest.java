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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteErRouteMapRequest extends RpcAcsRequest<DeleteErRouteMapResponse> {
	   

	private String erId;

	private List<String> erRouteMapIdss;
	public DeleteErRouteMapRequest() {
		super("eflo", "2022-05-30", "DeleteErRouteMap", "eflo");
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

	public List<String> getErRouteMapIdss() {
		return this.erRouteMapIdss;
	}

	public void setErRouteMapIdss(List<String> erRouteMapIdss) {
		this.erRouteMapIdss = erRouteMapIdss;	
		if (erRouteMapIdss != null) {
			for (int i = 0; i < erRouteMapIdss.size(); i++) {
				putBodyParameter("ErRouteMapIds." + (i + 1) , erRouteMapIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteErRouteMapResponse> getResponseClass() {
		return DeleteErRouteMapResponse.class;
	}

}
