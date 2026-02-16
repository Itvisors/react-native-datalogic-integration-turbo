import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  multiply(a: number, b: number): number;
  startReadListener(): void;
  stopReadListener(): void;
}

// No getEnforcing to avoid build issues on iOS
export default TurboModuleRegistry.get<Spec>('DatalogicIntegrationTurbo');
