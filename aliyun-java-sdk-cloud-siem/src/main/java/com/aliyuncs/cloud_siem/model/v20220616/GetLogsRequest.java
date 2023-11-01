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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLogsRequest extends RpcAcsRequest<GetLogsResponse> {
	   

	private Long total;

	private Integer pageSize;

	private Integer from;

	private Integer pageIndex;

	private Boolean reverseOrNot;

	private String query;

	private Integer to;
	public GetLogsRequest() {
		super("cloud-siem", "2022-06-16", "GetLogs", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
		if(total != null){
			putBodyParameter("Total", total.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public Boolean getReverseOrNot() {
		return this.reverseOrNot;
	}

	public void setReverseOrNot(Boolean reverseOrNot) {
		this.reverseOrNot = reverseOrNot;
		if(reverseOrNot != null){
			putBodyParameter("ReverseOrNot", reverseOrNot.toString());
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putBodyParameter("Query", query);
		}
	}

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to.toString());
		}
	}

	@Override
	public Class<GetLogsResponse> getResponseClass() {
		return GetLogsResponse.class;
	}

}
