const path = require('path');
const pkg = require('../package.json');

module.exports = {
  dependencies: {
    [pkg.name]: {
      root: path.join(__dirname, '..'),
      platforms: {
        // Codegen script incorrectly fails without this
        // So we explicitly specify the platforms with empty object
        // null for ios as this module is only intended for Android and should do nothing on iOS
        ios: null,
        android: {},
      },
    },
  },
};
