package com.github.triplet.gradle.play.internal

import java.io.File
import java.io.FileFilter

internal object ApkFileFilter : FileFilter {
    private const val APK_EXTENSION = "apk"

    override fun accept(file: File) = file.extension.toLowerCase() == APK_EXTENSION
}

internal object BundleFileFilter : FileFilter {
    private const val BUNDLE_EXTENSION = "aab"

    override fun accept(file: File) = file.extension.toLowerCase() == BUNDLE_EXTENSION
}
