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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.GetPhoneEncryptionPublicKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPhoneEncryptionPublicKeyResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String phoneNumber;

		private String encryptionPublicKey;

		private String encryptionPublicKeyStatus;

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEncryptionPublicKey() {
			return this.encryptionPublicKey;
		}

		public void setEncryptionPublicKey(String encryptionPublicKey) {
			this.encryptionPublicKey = encryptionPublicKey;
		}

		public String getEncryptionPublicKeyStatus() {
			return this.encryptionPublicKeyStatus;
		}

		public void setEncryptionPublicKeyStatus(String encryptionPublicKeyStatus) {
			this.encryptionPublicKeyStatus = encryptionPublicKeyStatus;
		}
	}

	@Override
	public GetPhoneEncryptionPublicKeyResponse getInstance(UnmarshallerContext context) {
		return	GetPhoneEncryptionPublicKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
