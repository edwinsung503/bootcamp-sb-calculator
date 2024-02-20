package com.vtxlab.bootcamp.democalculator.infra;

import lombok.Getter;

@Getter
public class ApiResponse<T> {

  private String code;
  private String message;

  public ApiResponse(final String code, final String message) {
    this.code = code;
    this.message = message;
  }

  public static <T> ApiResponseBuilder<T> builder() {
    return new ApiResponseBuilder();
  }

  public static class ApiResponseBuilder<T> {
    private String code;
    private String message;

    ApiResponseBuilder() {

    }

    public ApiResponseBuilder<T> status(Syscode syscode) {
      this.code = syscode.getCode();
      this.message = syscode.getMessage();
      return this;
    }

    // public ApiResponseBuilder<T> code(final String code) {
    //   this.code = code;
    //   return this;
    // }

    // public ApiResponseBuilder<T> message(final String message) {
    //   this.message = message;
    //   return this;
    // }

    

    public ApiResponse<T> build() {
      return new ApiResponse(this.code, this.message);
    }

    public String toString() {
      String var10000 = this.code;
      return "ApiResponse.ApiResponseBuilder(code=" + var10000 + ", message="
          + this.message +  ")";
    }
  }

}

