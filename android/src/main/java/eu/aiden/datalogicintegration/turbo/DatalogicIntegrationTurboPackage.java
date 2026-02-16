package eu.aiden.datalogicintegration.turbo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

public class DatalogicIntegrationTurboPackage extends BaseReactPackage {

  @Nullable
  @Override
  public NativeModule getModule(
      @NonNull String name,
      @NonNull ReactApplicationContext reactContext) {

    if (name.equals(DatalogicIntegrationTurboModule.NAME)) {
      return new DatalogicIntegrationTurboModule(reactContext);
    }
    return null;
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return new ReactModuleInfoProvider() {
      @Override
      public Map<String, ReactModuleInfo> getReactModuleInfos() {
        final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();

        moduleInfos.put(
            DatalogicIntegrationTurboModule.NAME,
            new ReactModuleInfo(
                DatalogicIntegrationTurboModule.NAME, // name
                DatalogicIntegrationTurboModule.NAME, // className
                false, // canOverrideExistingModule
                false, // needsEagerInit
                false, // isCxxModule
                true   // isTurboModule
            )
        );

        return moduleInfos;
      }
    };
  }
}
