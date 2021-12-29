# skeleton 💀

A simple Github template that lets you create an **Android/Kotlin** project and be up and running in a **few seconds**. 

This template is focused on delivering a project with **static analysis**, **modularization** and **continuous integration** already in place.

## How to use 👣

Just click on [![Use this template](https://img.shields.io/badge/-Use%20this%20template-brightgreen)](https://github.com/ninalofrese/skeleton/generate) button to create a new repo starting from this template.

Once created don't forget to update the:
- [App ID](buildSrc/src/main/java/Coordinates.kt)
- AndroidManifest ([here](app/src/main/AndroidManifest.xml))
- Package of the source files
- As you add more code into the packages, delete the `.gitkeep` files, that exists only as a placeholder for empty folders in git.

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

## Architecture

This template can be adjusted to your project needs, but was created aiming Clean Architecture by Feature Modularization.

- `:app`: Main application module, needed to create the App Bundle. Depends on `:core`, and indirectly on `:features` by dynamic features.
- `:core`: Used for business layers, such as data, domain and interactors. Can become a _kotlin-library_ module if Room is not used or is replaced by SQL Delight or else. Can depend on `libraries`.
- `:features`: Used for framework layers, such as presentation and UI. Is a `dynamic-feature` module, so it can be downloaded independently from the base application module. Depends on `:app`, `:core`, `:commons` and some specific `:libraries` 
- `:commons`: Contains code and resources which are shared between feature modules. `:commons:views` can hold design and views elements, such as Custom Views; and `:commons:ui` can hold framework bases, reusable classes and view manipulation, such as Base Adapters, LiveData, Extensions, etc. Can depend on `libraries`.
- `:libraries`: Contains utilities that can be used by different modules, such as test utils, Firebase sdk implementations or else. It doesn't depend on any other modules.

To make the creation of new modules easier, there are some common configuration files: 

- [android-module.gradle.kts](buildSrc/src/main/kotlin/android-module.gradle.kts)
- [kotlin-module.gradle.kts](buildSrc/src/main/kotlin/kotlin-module.gradle.kts)
- [dynamic-module.gradle.kts](buildSrc/src/main/kotlin/dynamic-module.gradle.kts)

## Static Analysis 🔍

This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `ktlintFormat` gradle task.

This template is also using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/ninalofrese/skeleton/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge](.github/workflows/pre-merge.yaml) - Will run `ktlintCheck`, `testDebugUnitTest`, instrumented tests with action [reactivecircus/android-emulator-runner@v2](https://github.com/ReactiveCircus/android-emulator-runner) and build.
- [Release debug](.github/workflows/release-debug.yaml) - Will create, upload and release debug APK to Github.
- [Template cleanup](.github/workflows/cleanup.yaml) - Will run when the template is used, including change in the package name, update of README, install of pre-commit hooks and remove cleanup scripts

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.

## Credits

Most of the structure on this template is based on [Kotlin Android Template](https://github.com/cortinico/kotlin-android-template). I adapted it to my needs and changed modules, dependencies and workflows.
