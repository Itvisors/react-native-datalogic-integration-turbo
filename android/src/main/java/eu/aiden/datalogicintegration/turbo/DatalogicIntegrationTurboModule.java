package eu.aiden.datalogicintegration.turbo;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;

public class DatalogicIntegrationTurboModule extends NativeDatalogicIntegrationTurboSpec {

  public static final String NAME = NativeDatalogicIntegrationTurboSpec.NAME;

  public DatalogicIntegrationTurboModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public double multiply(double a, double b) {
    return a * b;
  }

  @Override
  public void startReadListener() {

  }

  @Override
  public void stopReadListener() {

  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }
}
