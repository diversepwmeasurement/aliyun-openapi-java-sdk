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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.GetUserApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserApplicationsResponse extends AcsResponse {

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String code;

	private List<AppNameAndIdPairsItem> appNameAndIdPairs;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<AppNameAndIdPairsItem> getAppNameAndIdPairs() {
		return this.appNameAndIdPairs;
	}

	public void setAppNameAndIdPairs(List<AppNameAndIdPairsItem> appNameAndIdPairs) {
		this.appNameAndIdPairs = appNameAndIdPairs;
	}

	public static class AppNameAndIdPairsItem {

		private String appId;

		private String appName;

		private Integer appType;

		private Integer scopeType;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getAppType() {
			return this.appType;
		}

		public void setAppType(Integer appType) {
			this.appType = appType;
		}

		public Integer getScopeType() {
			return this.scopeType;
		}

		public void setScopeType(Integer scopeType) {
			this.scopeType = scopeType;
		}
	}

	@Override
	public GetUserApplicationsResponse getInstance(UnmarshallerContext context) {
		return	GetUserApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}