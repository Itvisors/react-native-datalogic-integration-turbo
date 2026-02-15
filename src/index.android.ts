import DatalogicIntegrationTurbo from './NativeDatalogicIntegrationTurbo';

export function multiply(a: number, b: number): number {
  if (!DatalogicIntegrationTurbo) {
    throw new Error('Native library DatalogicIntegrationTurbo not available');
  }
  return DatalogicIntegrationTurbo.multiply(a, b);
}
