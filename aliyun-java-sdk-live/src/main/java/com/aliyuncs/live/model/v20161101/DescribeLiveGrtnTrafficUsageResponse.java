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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveGrtnTrafficUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveGrtnTrafficUsageResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String filed;

	private String appId;

	private String area;

	private List<UsageData> usageDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFiled() {
		return this.filed;
	}

	public void setFiled(String filed) {
		this.filed = filed;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<UsageData> getUsageDataPerInterval() {
		return this.usageDataPerInterval;
	}

	public void setUsageDataPerInterval(List<UsageData> usageDataPerInterval) {
		this.usageDataPerInterval = usageDataPerInterval;
	}

	public static class UsageData {

		private Double value;

		private String timeStamp;

		public Double getValue() {
			return this.value;
		}

		public void setValue(Double value) {
			this.value = value;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeLiveGrtnTrafficUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveGrtnTrafficUsageResponseUnmarshaller.unmarshall(this, context);
	}
}
