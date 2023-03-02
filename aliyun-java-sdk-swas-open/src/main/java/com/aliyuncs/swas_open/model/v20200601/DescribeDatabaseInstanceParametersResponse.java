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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeDatabaseInstanceParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseInstanceParametersResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String engineVersion;

	private List<ConfigParameter> configParameters;

	private List<RunningParameter> runningParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<ConfigParameter> getConfigParameters() {
		return this.configParameters;
	}

	public void setConfigParameters(List<ConfigParameter> configParameters) {
		this.configParameters = configParameters;
	}

	public List<RunningParameter> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<RunningParameter> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public static class ConfigParameter {

		private String parameterDescription;

		private String parameterName;

		private String parameterValue;

		private String forceModify;

		private String forceRestart;

		private String checkingCode;

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getForceModify() {
			return this.forceModify;
		}

		public void setForceModify(String forceModify) {
			this.forceModify = forceModify;
		}

		public String getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(String forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}
	}

	public static class RunningParameter {

		private String parameterDescription;

		private String parameterName;

		private String parameterValue;

		private String forceModify;

		private String forceRestart;

		private String checkingCode;

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getForceModify() {
			return this.forceModify;
		}

		public void setForceModify(String forceModify) {
			this.forceModify = forceModify;
		}

		public String getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(String forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}
	}

	@Override
	public DescribeDatabaseInstanceParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseInstanceParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
