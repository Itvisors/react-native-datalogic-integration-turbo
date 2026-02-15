// Force null for ios. This ensures for cross platform apps nothing is included for this module
module.exports = {
  dependency: {
    platforms: {
      ios: null,
    },
  },
};
