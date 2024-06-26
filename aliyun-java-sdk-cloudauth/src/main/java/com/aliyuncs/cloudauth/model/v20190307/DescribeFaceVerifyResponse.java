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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeFaceVerifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFaceVerifyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private ResultObject resultObject;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private String subCode;

		private String materialInfo;

		private String identityInfo;

		private String deviceToken;

		private String passed;

		private String deviceRisk;

		private String success;

		private String userInfo;

		public String getSubCode() {
			return this.subCode;
		}

		public void setSubCode(String subCode) {
			this.subCode = subCode;
		}

		public String getMaterialInfo() {
			return this.materialInfo;
		}

		public void setMaterialInfo(String materialInfo) {
			this.materialInfo = materialInfo;
		}

		public String getIdentityInfo() {
			return this.identityInfo;
		}

		public void setIdentityInfo(String identityInfo) {
			this.identityInfo = identityInfo;
		}

		public String getDeviceToken() {
			return this.deviceToken;
		}

		public void setDeviceToken(String deviceToken) {
			this.deviceToken = deviceToken;
		}

		public String getPassed() {
			return this.passed;
		}

		public void setPassed(String passed) {
			this.passed = passed;
		}

		public String getDeviceRisk() {
			return this.deviceRisk;
		}

		public void setDeviceRisk(String deviceRisk) {
			this.deviceRisk = deviceRisk;
		}

		public String getSuccess() {
			return this.success;
		}

		public void setSuccess(String success) {
			this.success = success;
		}

		public String getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(String userInfo) {
			this.userInfo = userInfo;
		}
	}

	@Override
	public DescribeFaceVerifyResponse getInstance(UnmarshallerContext context) {
		return	DescribeFaceVerifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
