// Force null for ios. This ensures for cross platform apps nothing is included for this module
// Explicitly include android so the android build picks up the dependency
module.exports = {
  dependency: {
    platforms: {
      ios: null,
      android: {},
    },
  },
};
