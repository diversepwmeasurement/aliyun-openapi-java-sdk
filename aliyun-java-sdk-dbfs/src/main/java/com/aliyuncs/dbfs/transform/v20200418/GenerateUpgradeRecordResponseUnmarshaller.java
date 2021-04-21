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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.GenerateUpgradeRecordResponse;
import com.aliyuncs.dbfs.model.v20200418.GenerateUpgradeRecordResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUpgradeRecordResponseUnmarshaller {

	public static GenerateUpgradeRecordResponse unmarshall(GenerateUpgradeRecordResponse generateUpgradeRecordResponse, UnmarshallerContext _ctx) {
		
		generateUpgradeRecordResponse.setRequestId(_ctx.stringValue("GenerateUpgradeRecordResponse.RequestId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateUpgradeRecordResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setTargetVersion(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].TargetVersion"));
			recordsItem.setTaskId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].TaskId"));
			recordsItem.setAccountId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].AccountId"));
			recordsItem.setZoneId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].ZoneId"));
			recordsItem.setCreateTime(_ctx.longValue("GenerateUpgradeRecordResponse.Records["+ i +"].CreateTime"));
			recordsItem.setCurrentVersion(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].CurrentVersion"));
			recordsItem.setEcsId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].EcsId"));
			recordsItem.setTaskErrorReason(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].TaskErrorReason"));
			recordsItem.setUpgradeEndTime(_ctx.longValue("GenerateUpgradeRecordResponse.Records["+ i +"].UpgradeEndTime"));
			recordsItem.setBatchStrategyNo(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].BatchStrategyNo"));
			recordsItem.setState(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].State"));
			recordsItem.setUpdateTime(_ctx.longValue("GenerateUpgradeRecordResponse.Records["+ i +"].UpdateTime"));
			recordsItem.setDbfsId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].DbfsId"));
			recordsItem.setUpgradeStartTime(_ctx.longValue("GenerateUpgradeRecordResponse.Records["+ i +"].UpgradeStartTime"));
			recordsItem.setRegionId(_ctx.stringValue("GenerateUpgradeRecordResponse.Records["+ i +"].RegionId"));
			recordsItem.setId(_ctx.longValue("GenerateUpgradeRecordResponse.Records["+ i +"].Id"));
			recordsItem.setTaskExecutionCounts(_ctx.integerValue("GenerateUpgradeRecordResponse.Records["+ i +"].TaskExecutionCounts"));

			records.add(recordsItem);
		}
		generateUpgradeRecordResponse.setRecords(records);
	 
	 	return generateUpgradeRecordResponse;
	}
}