package eu.aiden.datalogicintegration.turbo;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;

// Empty package to make autolinking work in RN 0.78. The configuration and exports point to the real DatalogicIntegrationTurboPackage
// However, that class uses the new BaseReactPackage which RN 0.78.x autolinking does not recognize

public class DatalogicIntegrationTurboReactPackage implements ReactPackage {

  private final DatalogicIntegrationTurboPackage delegate = new DatalogicIntegrationTurboPackage();

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    // BaseReactPackage doesn't use this path, return empty.
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
