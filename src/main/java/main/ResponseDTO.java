package main;

public class ResponseDTO {
    private Boolean success;
    private String errorMessage;

    public ResponseDTO(){

    }
    public ResponseDTO(Boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
