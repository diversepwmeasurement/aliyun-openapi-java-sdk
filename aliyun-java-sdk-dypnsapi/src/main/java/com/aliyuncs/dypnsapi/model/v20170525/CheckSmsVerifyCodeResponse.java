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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.CheckSmsVerifyCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckSmsVerifyCodeResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String code;

	private Boolean success;

	private Model model;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String outId;

		private String verifyResult;

		public String getOutId() {
			return this.outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}

		public String getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(String verifyResult) {
			this.verifyResult = verifyResult;
		}
	}

	@Override
	public CheckSmsVerifyCodeResponse getInstance(UnmarshallerContext context) {
		return	CheckSmsVerifyCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
