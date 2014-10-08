package util;

public interface HttpCallbackListener {
    void onFinish(String response);
    void onnError(Exception e);
}
