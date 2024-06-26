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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.UpdatePhoneEncryptionPublicKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePhoneEncryptionPublicKeyResponseUnmarshaller {

	public static UpdatePhoneEncryptionPublicKeyResponse unmarshall(UpdatePhoneEncryptionPublicKeyResponse updatePhoneEncryptionPublicKeyResponse, UnmarshallerContext _ctx) {
		
		updatePhoneEncryptionPublicKeyResponse.setRequestId(_ctx.stringValue("UpdatePhoneEncryptionPublicKeyResponse.RequestId"));
		updatePhoneEncryptionPublicKeyResponse.setCode(_ctx.stringValue("UpdatePhoneEncryptionPublicKeyResponse.Code"));
		updatePhoneEncryptionPublicKeyResponse.setMessage(_ctx.stringValue("UpdatePhoneEncryptionPublicKeyResponse.Message"));
	 
	 	return updatePhoneEncryptionPublicKeyResponse;
	}
}