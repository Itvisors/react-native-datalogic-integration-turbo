import DatalogicIntegrationTurbo from './NativeDatalogicIntegrationTurbo';

export function startReadListener(): void {
  if (!DatalogicIntegrationTurbo) {
    throw new Error('Native library DatalogicIntegrationTurbo not available');
  }
  DatalogicIntegrationTurbo.startReadListener();
}

export function stopReadListener(): void {
  if (!DatalogicIntegrationTurbo) {
    throw new Error('Native library DatalogicIntegrationTurbo not available');
  }
  DatalogicIntegrationTurbo.stopReadListener();
}

export function getEventBarcodeValueScanned(): string {
  if (!DatalogicIntegrationTurbo) {
    throw new Error('Native library DatalogicIntegrationTurbo not available');
  }
  return DatalogicIntegrationTurbo.getEventBarcodeValueScanned();
}
