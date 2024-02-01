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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryStreamPushJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryStreamPushJobListResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private List<Job> jobList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Job> getJobList() {
			return this.jobList;
		}

		public void setJobList(List<Job> jobList) {
			this.jobList = jobList;
		}

		public static class Job {

			private String pushUrl;

			private Integer streamType;

			private String jobId;

			private Integer createTime;

			private Integer pushStatus;

			private Integer jobType;

			public String getPushUrl() {
				return this.pushUrl;
			}

			public void setPushUrl(String pushUrl) {
				this.pushUrl = pushUrl;
			}

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Integer getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Integer createTime) {
				this.createTime = createTime;
			}

			public Integer getPushStatus() {
				return this.pushStatus;
			}

			public void setPushStatus(Integer pushStatus) {
				this.pushStatus = pushStatus;
			}

			public Integer getJobType() {
				return this.jobType;
			}

			public void setJobType(Integer jobType) {
				this.jobType = jobType;
			}
		}
	}

	@Override
	public QueryStreamPushJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryStreamPushJobListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
