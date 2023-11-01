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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.CloseDeliveryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CloseDeliveryResponse extends AcsResponse {

	private Boolean data;

	private Boolean success;

	private Integer code;

	private String message;

	private String errCode;

	private String requestId;

	private String dyCode;

	private String dyMessage;

	public Boolean getData() {
		return this.data;
	}

	public void setData(Boolean data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDyCode() {
		return this.dyCode;
	}

	public void setDyCode(String dyCode) {
		this.dyCode = dyCode;
	}

	public String getDyMessage() {
		return this.dyMessage;
	}

	public void setDyMessage(String dyMessage) {
		this.dyMessage = dyMessage;
	}

	@Override
	public CloseDeliveryResponse getInstance(UnmarshallerContext context) {
		return	CloseDeliveryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
