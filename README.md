# skeleton

![Build](https://github.com/ninalofrese/skeleton/workflows/Build/badge.svg)

This is your new Kotlin Android Project! Happy hacking!

## Template ToDo list 👣

- [x] Create a new template project.
- [ ] Choose a [LICENSE](https://github.com/ninalofrese/skeleton/community/license/new?branch=main).
- [ ] Code some cool apps and libraries 🚀.

## Features 🎨

- **100% Kotlin-only template**.
- Created modules: app, api with submodule, feature with submodule and library with submodules base and design.
- 100% Gradle Kotlin DSL setup.
- CI Setup with GitHub Actions.
- Dependency versions managed via `buildSrc`, with updates indicated by task `./gradlew dependencyUpdates`.
- Kotlin Static Analysis via `ktlint` and `detekt`.
- Issues Template (bug report + feature request).
- Pull Request Template.

## Gradle Setup 🐘

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the [Dependencies.kt](buildSrc/src/main/java/Dependencies.kt) file in the `buildSrc` folder. This provides convenient auto-completion when writing your gradle files.

## Static Analysis 🔍

This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `ktlintFormat` gradle task.

This template is also using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/ninalofrese/skeleton/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Build](.github/workflows/build.yaml) - Will run `ktlintCheck`, `testDebugUnitTest`, instrumented tests with action [reactivecircus/android-emulator-runner@v2](https://github.com/ReactiveCircus/android-emulator-runner) and build.
- [Release debug](.github/workflows/release-debug.yaml) - Will create, upload and release debug APK to Github.

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.

## Credits

Based on [Kotlin Android Template](https://github.com/cortinico/kotlin-android-template)