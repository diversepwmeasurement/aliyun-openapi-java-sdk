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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreateCommentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCommentResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String commentBizId;

		private String commentType;

		private String state;

		private Boolean resolved;

		private Boolean deleted;

		private String commentTime;

		private String lastEditTime;

		private String content;

		private String lineNumber;

		private String filePath;

		private String parentCommentBizId;

		private String rootCommentBizId;

		private Author author;

		private RelatedPatchSet relatedPatchSet;

		public String getCommentBizId() {
			return this.commentBizId;
		}

		public void setCommentBizId(String commentBizId) {
			this.commentBizId = commentBizId;
		}

		public String getCommentType() {
			return this.commentType;
		}

		public void setCommentType(String commentType) {
			this.commentType = commentType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Boolean getResolved() {
			return this.resolved;
		}

		public void setResolved(Boolean resolved) {
			this.resolved = resolved;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getCommentTime() {
			return this.commentTime;
		}

		public void setCommentTime(String commentTime) {
			this.commentTime = commentTime;
		}

		public String getLastEditTime() {
			return this.lastEditTime;
		}

		public void setLastEditTime(String lastEditTime) {
			this.lastEditTime = lastEditTime;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getLineNumber() {
			return this.lineNumber;
		}

		public void setLineNumber(String lineNumber) {
			this.lineNumber = lineNumber;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getParentCommentBizId() {
			return this.parentCommentBizId;
		}

		public void setParentCommentBizId(String parentCommentBizId) {
			this.parentCommentBizId = parentCommentBizId;
		}

		public String getRootCommentBizId() {
			return this.rootCommentBizId;
		}

		public void setRootCommentBizId(String rootCommentBizId) {
			this.rootCommentBizId = rootCommentBizId;
		}

		public Author getAuthor() {
			return this.author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public RelatedPatchSet getRelatedPatchSet() {
			return this.relatedPatchSet;
		}

		public void setRelatedPatchSet(RelatedPatchSet relatedPatchSet) {
			this.relatedPatchSet = relatedPatchSet;
		}

		public static class Author {

			private String aliyunPk;

			private String name;

			private String username;

			private String state;

			private String avatarUrl;

			private String email;

			private Long id;

			public String getAliyunPk() {
				return this.aliyunPk;
			}

			public void setAliyunPk(String aliyunPk) {
				this.aliyunPk = aliyunPk;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class RelatedPatchSet {

			private String patchSetNo;

			private String patchSetBizId;

			private String patchSetName;

			private String commitId;

			private String shortId;

			private String relatedMergeItemType;

			private String createdAt;

			public String getPatchSetNo() {
				return this.patchSetNo;
			}

			public void setPatchSetNo(String patchSetNo) {
				this.patchSetNo = patchSetNo;
			}

			public String getPatchSetBizId() {
				return this.patchSetBizId;
			}

			public void setPatchSetBizId(String patchSetBizId) {
				this.patchSetBizId = patchSetBizId;
			}

			public String getPatchSetName() {
				return this.patchSetName;
			}

			public void setPatchSetName(String patchSetName) {
				this.patchSetName = patchSetName;
			}

			public String getCommitId() {
				return this.commitId;
			}

			public void setCommitId(String commitId) {
				this.commitId = commitId;
			}

			public String getShortId() {
				return this.shortId;
			}

			public void setShortId(String shortId) {
				this.shortId = shortId;
			}

			public String getRelatedMergeItemType() {
				return this.relatedMergeItemType;
			}

			public void setRelatedMergeItemType(String relatedMergeItemType) {
				this.relatedMergeItemType = relatedMergeItemType;
			}

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}
		}
	}

	@Override
	public CreateCommentResponse getInstance(UnmarshallerContext context) {
		return	CreateCommentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
