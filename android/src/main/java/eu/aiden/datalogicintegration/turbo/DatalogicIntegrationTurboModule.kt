package eu.aiden.datalogicintegration.turbo

import eu.aiden.datalogicintegration.turbo.NativeDatalogicIntegrationTurboSpec
import com.facebook.react.bridge.ReactApplicationContext

class DatalogicIntegrationTurboModule(reactContext: ReactApplicationContext) :
  NativeDatalogicIntegrationTurboSpec(reactContext) {

  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = NativeDatalogicIntegrationTurboSpec.NAME
  }
}
