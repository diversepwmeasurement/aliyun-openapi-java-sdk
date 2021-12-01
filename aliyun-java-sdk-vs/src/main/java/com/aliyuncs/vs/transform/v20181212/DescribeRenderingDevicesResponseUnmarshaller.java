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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeRenderingDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeRenderingDevicesResponse.Device;
import com.aliyuncs.vs.model.v20181212.DescribeRenderingDevicesResponse.Device.IpInfo;
import com.aliyuncs.vs.model.v20181212.DescribeRenderingDevicesResponse.Device.PodInfo;
import com.aliyuncs.vs.model.v20181212.DescribeRenderingDevicesResponse.Device.PodInfo.NetworkItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRenderingDevicesResponseUnmarshaller {

	public static DescribeRenderingDevicesResponse unmarshall(DescribeRenderingDevicesResponse describeRenderingDevicesResponse, UnmarshallerContext _ctx) {
		
		describeRenderingDevicesResponse.setRequestId(_ctx.stringValue("DescribeRenderingDevicesResponse.RequestId"));
		describeRenderingDevicesResponse.setTotal(_ctx.longValue("DescribeRenderingDevicesResponse.Total"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRenderingDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setInstanceId(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].InstanceId"));
			device.setClusterId(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].ClusterId"));
			device.setDescription(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].Description"));
			device.setEdgeNodeName(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].EdgeNodeName"));
			device.setPlatformType(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PlatformType"));
			device.setSpecification(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].Specification"));
			device.setStatus(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].Status"));
			device.setImageId(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].ImageId"));
			device.setInstanceName(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].InstanceName"));
			device.setMacAddress(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].MacAddress"));
			device.setServerName(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].ServerName"));
			device.setInstanceChargeType(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].InstanceChargeType"));
			device.setAutoRenew(_ctx.booleanValue("DescribeRenderingDevicesResponse.Devices["+ i +"].AutoRenew"));
			device.setAutoRenewPeriod(_ctx.integerValue("DescribeRenderingDevicesResponse.Devices["+ i +"].AutoRenewPeriod"));
			device.setPeriod(_ctx.integerValue("DescribeRenderingDevicesResponse.Devices["+ i +"].Period"));
			device.setPeriodUnit(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PeriodUnit"));

			List<IpInfo> ipInfos = new ArrayList<IpInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos.Length"); j++) {
				IpInfo ipInfo = new IpInfo();
				ipInfo.setNatType(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].NatType"));
				ipInfo.setExternalIp(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ExternalIp"));
				ipInfo.setExternalPort(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ExternalPort"));
				ipInfo.setInternalIp(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].InternalIp"));
				ipInfo.setInternalPort(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].InternalPort"));
				ipInfo.setIpProtocol(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].IpProtocol"));
				ipInfo.setISP(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ISP"));

				ipInfos.add(ipInfo);
			}
			device.setIpInfos(ipInfos);

			List<PodInfo> podInfos = new ArrayList<PodInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos.Length"); j++) {
				PodInfo podInfo = new PodInfo();
				podInfo.setPodId(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].PodId"));
				podInfo.setStatus(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Status"));

				List<NetworkItem> network = new ArrayList<NetworkItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network.Length"); k++) {
					NetworkItem networkItem = new NetworkItem();
					networkItem.setExternalIp(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ExternalIp"));
					networkItem.setContainerPorts(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ContainerPorts"));
					networkItem.setExternalPorts(_ctx.stringValue("DescribeRenderingDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ExternalPorts"));

					network.add(networkItem);
				}
				podInfo.setNetwork(network);

				podInfos.add(podInfo);
			}
			device.setPodInfos(podInfos);

			devices.add(device);
		}
		describeRenderingDevicesResponse.setDevices(devices);
	 
	 	return describeRenderingDevicesResponse;
	}
}