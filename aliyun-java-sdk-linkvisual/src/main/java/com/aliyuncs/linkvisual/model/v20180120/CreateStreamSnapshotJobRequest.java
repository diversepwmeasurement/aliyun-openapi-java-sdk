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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateStreamSnapshotJobRequest extends RpcAcsRequest<CreateStreamSnapshotJobResponse> {
	   

	private String iotId;

	private String iotInstanceId;

	private Integer streamType;

	private String productKey;

	private Integer snapshotInterval;

	private String deviceName;
	public CreateStreamSnapshotJobRequest() {
		super("Linkvisual", "2018-01-20", "CreateStreamSnapshotJob", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getStreamType() {
		return this.streamType;
	}

	public void setStreamType(Integer streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Integer getSnapshotInterval() {
		return this.snapshotInterval;
	}

	public void setSnapshotInterval(Integer snapshotInterval) {
		this.snapshotInterval = snapshotInterval;
		if(snapshotInterval != null){
			putQueryParameter("SnapshotInterval", snapshotInterval.toString());
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<CreateStreamSnapshotJobResponse> getResponseClass() {
		return CreateStreamSnapshotJobResponse.class;
	}

}
