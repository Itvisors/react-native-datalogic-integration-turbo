import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  startReadListener(): void;
  stopReadListener(): void;
  getEventBarcodeValueScanned(): string;
}

// No getEnforcing to avoid build issues on iOS
export default TurboModuleRegistry.get<Spec>('DatalogicIntegrationTurbo');
