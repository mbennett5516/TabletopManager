package com.bennett.app.ui.models.responses;

public class OperationStatusModel {

	private String operationResult;
	private String operationName;

	public OperationStatusModel(String operationResult, String operationName) {
		super();
		this.operationResult = operationResult;
		this.operationName = operationName;
	}

	public OperationStatusModel() {
	}

	public String getOperationResult() {
		return operationResult;
	}

	public void setOperationResult(String operationResult) {
		this.operationResult = operationResult;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

}
