# react-native-datalogic-integration-turbo

React Native DataLogic integration for New Architecture

We publish this package to make it easier to integrate it into our projects.
Feel free to use it but we do not provide any support outside our projects.

## Installation


```sh
npm install @aidenlowcode/react-native-datalogic-integration-turbo
```


## Usage

```js
import { startReadListener, stopReadListener, getEventBarcodeValueScanned } from '@aidenlowcode/react-native-datalogic-integration-turbo';

// Start the listener
startReadListener();

// Receive scanned value
  useEffect(() => {
    const eventEmitter = new NativeEventEmitter(NativeModules.DatalogicIntegration);
    let eventListener = eventEmitter.addListener(getEventBarcodeValueScanned(), (event) => {
      setScannedValue(event.scannedValue);
    });

    // Removes the listener once unmounted
    return () => {
      eventListener.remove();
    };
  }, []);

// Stop the listener
stopReadListener();
```

Take care to stop the listener when the app is backgrounded or closed

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
