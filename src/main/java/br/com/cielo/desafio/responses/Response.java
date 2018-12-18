package br.com.cielo.desafio.responses;

import com.fasterxml.jackson.annotation.JsonView;

public class Response<T> {
	
	@JsonView
	private T data;
	
	public Response(T data) {
		super();
		this.data = data;
	}

	public Response() {
		super();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
