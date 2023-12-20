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

package com.aliyuncs.cas.transform.v20200407;

import com.aliyuncs.cas.model.v20200407.UploadUserCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadUserCertificateResponseUnmarshaller {

	public static UploadUserCertificateResponse unmarshall(UploadUserCertificateResponse uploadUserCertificateResponse, UnmarshallerContext _ctx) {
		
		uploadUserCertificateResponse.setRequestId(_ctx.stringValue("UploadUserCertificateResponse.RequestId"));
		uploadUserCertificateResponse.setCertId(_ctx.longValue("UploadUserCertificateResponse.CertId"));
	 
	 	return uploadUserCertificateResponse;
	}
}