plugins {
    id("commons.android-module")
}
dependencies {
    NetworkLibs.deps.forEach { implementation(it) }
    CacheLibs.deps.forEach { implementation(it) }
}
