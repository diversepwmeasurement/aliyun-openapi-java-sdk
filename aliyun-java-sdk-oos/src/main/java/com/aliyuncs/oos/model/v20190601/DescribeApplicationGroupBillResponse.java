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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.DescribeApplicationGroupBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationGroupBillResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<ApplicationGroupConsumeItem> applicationGroupConsume;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ApplicationGroupConsumeItem> getApplicationGroupConsume() {
		return this.applicationGroupConsume;
	}

	public void setApplicationGroupConsume(List<ApplicationGroupConsumeItem> applicationGroupConsume) {
		this.applicationGroupConsume = applicationGroupConsume;
	}

	public static class ApplicationGroupConsumeItem {

		private String instanceId;

		private String instanceName;

		private String instanceType;

		private String creationTime;

		private String status;

		private Float amount;

		private String currency;

		private String performance;

		private String optimization;

		private String peakType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Float getAmount() {
			return this.amount;
		}

		public void setAmount(Float amount) {
			this.amount = amount;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getPerformance() {
			return this.performance;
		}

		public void setPerformance(String performance) {
			this.performance = performance;
		}

		public String getOptimization() {
			return this.optimization;
		}

		public void setOptimization(String optimization) {
			this.optimization = optimization;
		}

		public String getPeakType() {
			return this.peakType;
		}

		public void setPeakType(String peakType) {
			this.peakType = peakType;
		}
	}

	@Override
	public DescribeApplicationGroupBillResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationGroupBillResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
