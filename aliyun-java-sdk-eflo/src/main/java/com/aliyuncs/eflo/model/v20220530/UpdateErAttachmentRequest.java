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
public class UpdateErAttachmentRequest extends RpcAcsRequest<UpdateErAttachmentResponse> {
	   

	private String erId;

	private String erAttachmentId;

	private String erAttachmentName;
	public UpdateErAttachmentRequest() {
		super("eflo", "2022-05-30", "UpdateErAttachment", "eflo");
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

	public String getErAttachmentId() {
		return this.erAttachmentId;
	}

	public void setErAttachmentId(String erAttachmentId) {
		this.erAttachmentId = erAttachmentId;
		if(erAttachmentId != null){
			putBodyParameter("ErAttachmentId", erAttachmentId);
		}
	}

	public String getErAttachmentName() {
		return this.erAttachmentName;
	}

	public void setErAttachmentName(String erAttachmentName) {
		this.erAttachmentName = erAttachmentName;
		if(erAttachmentName != null){
			putBodyParameter("ErAttachmentName", erAttachmentName);
		}
	}

	@Override
	public Class<UpdateErAttachmentResponse> getResponseClass() {
		return UpdateErAttachmentResponse.class;
	}

}
