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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetAdvancedSearchFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAdvancedSearchFileResponse extends AcsResponse {

	private String requestId;

	private ResourceSearch resourceSearch;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceSearch getResourceSearch() {
		return this.resourceSearch;
	}

	public void setResourceSearch(ResourceSearch resourceSearch) {
		this.resourceSearch = resourceSearch;
	}

	public static class ResourceSearch {

		private String downloadUrl;

		private String status;

		private Long accountId;

		private Long resourceInventoryGenerateTime;

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public Long getResourceInventoryGenerateTime() {
			return this.resourceInventoryGenerateTime;
		}

		public void setResourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
			this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
		}
	}

	@Override
	public GetAdvancedSearchFileResponse getInstance(UnmarshallerContext context) {
		return	GetAdvancedSearchFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
