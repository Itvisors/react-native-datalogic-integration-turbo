// Force null for ios. This ensures for cross platform apps nothing is included for this module
// Explicitly include android so the android build picks up the dependency
// Explicitly set android configuration options to make RN 0.78 autolinking work. Probably not necessary anymore in newer RN releases
module.exports = {
  dependency: {
    platforms: {
      ios: null,
      android: {
        sourceDir: 'android',
        manifestPath: 'src/main/AndroidManifest.xml',
        packageImportPath: 'import eu.aiden.datalogicintegration.turbo.DatalogicIntegrationTurboPackage;',
        packageInstance: 'new eu.aiden.datalogicintegration.turbo.DatalogicIntegrationTurboPackage()',
      },
    },
  },
};
